package com.diviso.graeshoppe.customerappgateway.service;

import java.util.List;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Offer;

public interface OfferQueryService {
	
	public List<Offer> findOfferLinesByOrderId(Long orderId) ;

}
