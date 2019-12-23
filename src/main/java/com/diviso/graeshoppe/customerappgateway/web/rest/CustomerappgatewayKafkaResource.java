package com.diviso.graeshoppe.customerappgateway.web.rest;

import com.diviso.graeshoppe.customerappgateway.service.CustomerappgatewayKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customerappgateway-kafka")
public class CustomerappgatewayKafkaResource {

    private final Logger log = LoggerFactory.getLogger(CustomerappgatewayKafkaResource.class);

    private CustomerappgatewayKafkaProducer kafkaProducer;

    public CustomerappgatewayKafkaResource(CustomerappgatewayKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.send(message);
    }
}
