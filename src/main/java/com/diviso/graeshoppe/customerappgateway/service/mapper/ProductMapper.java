package com.diviso.graeshoppe.customerappgateway.service.mapper;



import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.Product;
import com.diviso.graeshoppe.customerappgateway.client.product.model.ProductDTO;

/**
 * Mapper for the entity Product and its DTO ProductDTO.
 */
@Mapper(componentModel = "spring", uses = {TaxCategoryMapper.class, UOMMapper.class, LocationMapper.class, SupplierMapper.class, ManufacturerMapper.class, BrandMapper.class, DiscountMapper.class, CategoryMapper.class})
public interface ProductMapper extends EntityMapper<ProductDTO, Product> {

    @Mapping(source = "taxCategory.id", target = "taxCategoryId")
    @Mapping(source = "unit.id", target = "unitId")
    @Mapping(source = "location.id", target = "locationId")
    //@Mapping(source = "supplier.id", target = "supplierId")
    @Mapping(source = "manufacturer.id", target = "manufacturerId")
    @Mapping(source = "brand.id", target = "brandId")
    @Mapping(source = "discount.id", target = "discountId")
    @Mapping(source = "category.id", target = "categoryId")
    ProductDTO toDto(Product product);

    @Mapping(target = "auxilaryLineItems", ignore = true)
    @Mapping(target = "comboLineItems", ignore = true)
    @Mapping(target = "labels", ignore = true)
    @Mapping(source = "taxCategoryId", target = "taxCategory")
    @Mapping(source = "unitId", target = "unit")
    @Mapping(source = "locationId", target = "location")
    @Mapping(source = "supplierId", target = "supplier")
    @Mapping(source = "manufacturerId", target = "manufacturer")
    @Mapping(source = "brandId", target = "brand")
    @Mapping(source = "discountId", target = "discount")
    @Mapping(source = "categoryId", target = "category")
    Product toEntity(ProductDTO productDTO);

    default Product fromId(Long id) {
        if (id == null) {
            return null;
        }
        Product product = new Product();
        product.setId(id);
        return product;
    }
}