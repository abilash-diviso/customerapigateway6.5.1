package com.diviso.graeshoppe.customerappgateway.service.mapper;



import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.UOM;
import com.diviso.graeshoppe.customerappgateway.client.product.model.UOMDTO;

/**
 * Mapper for the entity UOM and its DTO UOMDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface UOMMapper extends EntityMapper<UOMDTO, UOM> {



    default UOM fromId(Long id) {
        if (id == null) {
            return null;
        }
        UOM uOM = new UOM();
        uOM.setId(id);
        return uOM;
    }
}