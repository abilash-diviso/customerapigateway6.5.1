package com.diviso.graeshoppe.customerappgateway.service.mapper;

import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.Manufacturer;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ManufacturerDTO;

/**
 * Mapper for the entity Manufacturer and its DTO ManufacturerDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ManufacturerMapper extends EntityMapper<ManufacturerDTO, Manufacturer> {



    default Manufacturer fromId(Long id) {
        if (id == null) {
            return null;
        }
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(id);
        return manufacturer;
    }
}