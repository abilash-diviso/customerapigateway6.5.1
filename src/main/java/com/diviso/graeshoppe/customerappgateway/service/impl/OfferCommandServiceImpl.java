package com.diviso.graeshoppe.customerappgateway.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.customerappgateway.client.offer.api.AggregateCommandResourceApi;
import com.diviso.graeshoppe.customerappgateway.client.offer.model.OrderModel;
import com.diviso.graeshoppe.customerappgateway.client.order.api.OrderQueryResourceApi;
import com.diviso.graeshoppe.customerappgateway.service.OfferCommandService;

@Service
public class OfferCommandServiceImpl implements OfferCommandService {

	@Autowired
	private AggregateCommandResourceApi aggregateCommandResourceApi;

	private Logger log = LoggerFactory.getLogger(OfferCommandServiceImpl.class);
	@Autowired
	private OrderQueryResourceApi orderQueryResourceApi;

	@Override
	public ResponseEntity<OrderModel> claimOffer(OrderModel orderModel, String customerId) {
		Long count = orderQueryResourceApi.countByCustomerIdAndStatusNameUsingGET(customerId, "payment-processed-unapproved")
				.getBody();
		log.info("Count for the customer " + customerId + " is " + count);
		orderModel.setOrderNumber(count + 1);
		orderModel.setPromoCode("SUPER10");

		ResponseEntity<OrderModel> result = aggregateCommandResourceApi.claimOfferUsingPOST(orderModel);
		return result;

	}

}
