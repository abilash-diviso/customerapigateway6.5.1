package com.diviso.graeshoppe.customerappgateway.service.mapper;



import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.TaxCategory;
import com.diviso.graeshoppe.customerappgateway.client.product.model.TaxCategoryDTO;

/**
 * Mapper for the entity TaxCategory and its DTO TaxCategoryDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface TaxCategoryMapper extends EntityMapper<TaxCategoryDTO, TaxCategory> {


    @Override
	@Mapping(target = "taxes", ignore = true)
    TaxCategory toEntity(TaxCategoryDTO taxCategoryDTO);

    default TaxCategory fromId(Long id) {
        if (id == null) {
            return null;
        }
        TaxCategory taxCategory = new TaxCategory();
        taxCategory.setId(id);
        return taxCategory;
    }
}