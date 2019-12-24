package com.diviso.graeshoppe.customerappgateway.service.mapper;

import org.mapstruct.Mapper;

import com.diviso.graeshoppe.customerappgateway.client.product.model.Address;
import com.diviso.graeshoppe.customerappgateway.client.product.model.AddressDTO;

@Mapper(componentModel = "spring", uses = {})
public interface AddressMapper extends EntityMapper<AddressDTO, Address> {



    default Address fromId(Long id) {
        if (id == null) {
            return null;
        }
        Address address = new Address();
        address.setId(id);
        return address;
    }
}