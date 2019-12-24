package com.diviso.graeshoppe.customerappgateway.client.order.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.customerappgateway.client.order.OrderClientConfiguration;

@FeignClient(name="${order.name:order}", url="${order.url}", configuration = OrderClientConfiguration.class)
public interface DeliveryInfoResourceApiClient extends DeliveryInfoResourceApi {
}