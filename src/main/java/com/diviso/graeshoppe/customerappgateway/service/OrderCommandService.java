package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.customerappgateway.client.order.model.AddressDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.CommandResource;
import com.diviso.graeshoppe.customerappgateway.client.order.model.DeliveryInfoDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.NotificationDTO;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.DeliveryInfo;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderInitiateResponse;

public interface OrderCommandService {

	OrderInitiateResponse initiateOrder(Order order);

	ResponseEntity<AddressDTO> createAddressUsingPOST(AddressDTO addressDTO);

	CommandResource createDeliveryInfo(String taskId, DeliveryInfo deliveryInfo, String orderId);

	DeliveryInfoDTO editDeliveryInfo(DeliveryInfo deliveryInfo);

	void deleteOrderLine(Long id);

	void deleteAuxilaryOrderLine(Long id);

	Order editOrder(Order order);

	ResponseEntity<NotificationDTO> updateNotification(NotificationDTO notificationDTO);

	ResponseEntity<AddressDTO> updateAddress(AddressDTO addressDTO);

	ResponseEntity<Void> deleteAddress(Long id);

}
