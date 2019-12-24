package com.diviso.graeshoppe.customerappgateway.service.mapper;

import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.Discount;
import com.diviso.graeshoppe.customerappgateway.client.product.model.DiscountDTO;

/**
 * Mapper for the entity Discount and its DTO DiscountDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface DiscountMapper extends EntityMapper<DiscountDTO, Discount> {



    default Discount fromId(Long id) {
        if (id == null) {
            return null;
        }
        Discount discount = new Discount();
        discount.setId(id);
        return discount;
    }
}