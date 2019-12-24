package com.diviso.graeshoppe.customerappgateway.service;

import org.springframework.http.ResponseEntity;

import com.diviso.graeshoppe.customerappgateway.client.offer.model.OrderModel;

public interface OfferCommandService {

	ResponseEntity<OrderModel> claimOffer(OrderModel orderModel, String customerId);

}
