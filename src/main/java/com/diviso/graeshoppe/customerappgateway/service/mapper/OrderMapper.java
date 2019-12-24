package com.diviso.graeshoppe.customerappgateway.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Order;
import com.diviso.graeshoppe.customerappgateway.client.order.model.OrderDTO;

/**
 * Mapper for the entity Order and its DTO OrderDTO.
 */
@Mapper(componentModel = "spring", uses = {DeliveryInfoMapper.class, ApprovalDetailsMapper.class, StatusMapper.class})
public interface OrderMapper extends EntityMapper<OrderDTO, Order> {

    @Override
	@Mapping(source = "deliveryInfo.id", target = "deliveryInfoId")
    @Mapping(source = "status.id", target = "statusId")
    OrderDTO toDto(Order order);

    @Override
	@Mapping(source = "deliveryInfoId", target = "deliveryInfo.id")
    @Mapping(source = "statusId", target = "status.id")
    Order toEntity(OrderDTO orderDTO);

   
}
