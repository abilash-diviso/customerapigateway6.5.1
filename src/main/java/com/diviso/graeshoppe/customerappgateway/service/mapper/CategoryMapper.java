package com.diviso.graeshoppe.customerappgateway.service.mapper;

import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.Category;
import com.diviso.graeshoppe.customerappgateway.client.product.model.CategoryDTO;

/**
 * Mapper for the entity Category and its DTO CategoryDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CategoryMapper extends EntityMapper<CategoryDTO, Category> {


    @Mapping(target = "products", ignore = true)
    Category toEntity(CategoryDTO categoryDTO);

    default Category fromId(Long id) {
        if (id == null) {
            return null;
        }
        Category category = new Category();
        category.setId(id);
        return category;
    }
}