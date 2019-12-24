package com.diviso.graeshoppe.customerappgateway.service.mapper;

import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.Brand;
import com.diviso.graeshoppe.customerappgateway.client.product.model.BrandDTO;

/**
 * Mapper for the entity Brand and its DTO BrandDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface BrandMapper extends EntityMapper<BrandDTO, Brand> {



    default Brand fromId(Long id) {
        if (id == null) {
            return null;
        }
        Brand brand = new Brand();
        brand.setId(id);
        return brand;
    }
}