package com.diviso.graeshoppe.customerappgateway.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.order.model.aggregator.Status;
import com.diviso.graeshoppe.customerappgateway.client.order.model.StatusDTO;


/**
 * Mapper for the entity Status and its DTO StatusDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface StatusMapper extends EntityMapper<StatusDTO
, Status> {



    default Status fromId(Long id) {
        if (id == null) {
            return null;
        }
        Status status = new Status();
        status.setId(id);
        return status;
    }
}
