package com.diviso.graeshoppe.customerappgateway.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Offer;
import com.diviso.graeshoppe.customerappgateway.client.order.model.OfferDTO;

/**
 * Mapper for the entity Offer and its DTO OfferDTO.
 */
@Mapper(componentModel = "spring", uses = {OrderMapper.class})
public interface OfferMapper extends EntityMapper<OfferDTO, Offer> {

    @Override
    OfferDTO toDto(Offer offer);

    @Override
    Offer toEntity(OfferDTO offerDTO);

    
}
