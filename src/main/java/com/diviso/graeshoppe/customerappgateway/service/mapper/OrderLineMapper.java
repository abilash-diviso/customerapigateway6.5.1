package com.diviso.graeshoppe.customerappgateway.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.OrderLine;
import com.diviso.graeshoppe.customerappgateway.client.order.model.OrderLineDTO;

/**
 * Mapper for the entity OrderLine and its DTO OrderLineDTO.
 */
@Mapper(componentModel = "spring", uses = {OrderMapper.class})
public interface OrderLineMapper extends EntityMapper<OrderLineDTO, OrderLine> {

    @Override
    OrderLineDTO toDto(OrderLine orderLine);

    @Override
    OrderLine toEntity(OrderLineDTO orderLineDTO);

    
}
