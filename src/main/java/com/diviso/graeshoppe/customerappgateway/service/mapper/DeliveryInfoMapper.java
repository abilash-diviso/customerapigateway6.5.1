package com.diviso.graeshoppe.customerappgateway.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.DeliveryInfo;
import com.diviso.graeshoppe.customerappgateway.client.order.model.DeliveryInfoDTO;

/**
 * Mapper for the entity DeliveryInfo and its DTO DeliveryInfoDTO.
 */
@Mapper(componentModel = "spring")
public interface DeliveryInfoMapper extends EntityMapper<DeliveryInfoDTO, DeliveryInfo> {

    @Override
     DeliveryInfoDTO toDto(DeliveryInfo deliveryInfo);

    @Override
    DeliveryInfo toEntity(DeliveryInfoDTO deliveryInfoDTO);

 
}
