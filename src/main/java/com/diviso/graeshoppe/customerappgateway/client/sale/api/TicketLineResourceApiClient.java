package com.diviso.graeshoppe.customerappgateway.client.sale.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.customerappgateway.client.sale.SaleClientConfiguration;

@FeignClient(name="${sale.name:sale}", url="${sale.url}", configuration = SaleClientConfiguration.class)
public interface TicketLineResourceApiClient extends TicketLineResourceApi {
}