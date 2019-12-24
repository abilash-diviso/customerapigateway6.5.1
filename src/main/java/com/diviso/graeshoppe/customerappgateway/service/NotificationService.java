package com.diviso.graeshoppe.customerappgateway.service;

import com.corundumstudio.socketio.SocketIOServer;
import com.diviso.graeshoppe.customerappgateway.client.order.model.NotificationDTO;
import com.diviso.graeshoppe.customerappgateway.config.KafkaProperties;
import com.diviso.graeshoppe.notification.avro.Notification;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class NotificationService {

	private final Logger log = LoggerFactory.getLogger(NotificationService.class);

	@Autowired
	private SocketIOServer socketIOServer;

	private final AtomicBoolean closed = new AtomicBoolean(false);

	@Value("${topic.notification}")
	public String topic;

	private final KafkaProperties kafkaProperties;

	private KafkaConsumer<String, Notification> kafkaConsumer;

	public NotificationService(KafkaProperties kafkaProperties) {
		this.kafkaProperties = kafkaProperties;
	}

	public void start() {
		log.info("Kafka consumer starting notification...");
		this.kafkaConsumer = new KafkaConsumer<>(kafkaProperties.getConsumerProps());
		Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));

		Thread consumerThread = new Thread(() -> {
			try {
				kafkaConsumer.subscribe(Collections.singletonList(topic));
				log.info("Kafka consumer started");
				while (!closed.get()) {
					ConsumerRecords<String, Notification> records = kafkaConsumer.poll(Duration.ofSeconds(3));
					records.forEach(record -> {
						sendNotification(record.value());
					});
				}
				kafkaConsumer.commitSync();
			} catch (WakeupException e) {
				if (!closed.get())
					throw e;
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			} finally {
				kafkaConsumer.close();
			}
		});
		consumerThread.start();
	}

	public KafkaConsumer<String, Notification> getKafkaConsumer() {
		return kafkaConsumer;
	}

	public void shutdown() {
		log.info("Shutdown Kafka consumer");
		closed.set(true);
		kafkaConsumer.wakeup();
	}

	private void sendNotification(Notification message) {
		log.info("Notification is send via socket server");
		NotificationDTO notificationDTO = new NotificationDTO();
		notificationDTO
				.setDate(OffsetDateTime.ofInstant(Instant.ofEpochMilli(message.getDate()), ZoneId.systemDefault()));
		notificationDTO.setTitle(message.getTitle());
		notificationDTO.setMessage(message.getMessage());
		notificationDTO.setTargetId(message.getTargetId());
		notificationDTO.setReceiverId(message.getReceiverId());
		notificationDTO.setId(message.getId());
		notificationDTO.setStatus(message.getStatus());
		socketIOServer.getBroadcastOperations().sendEvent(message.getReceiverId(), notificationDTO);
	}
}
