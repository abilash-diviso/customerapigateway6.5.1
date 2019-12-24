package com.diviso.graeshoppe.customerappgateway.service.mapper;


import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.customer.model.Customer;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.CustomerDTO;

/**
 * Mapper for the entity Customer and its DTO CustomerDTO.
 */
@Mapper(componentModel = "spring", uses = {ContactMapper.class})
public interface CustomerMapper extends EntityMapper<CustomerDTO, Customer> {

    @Mapping(source = "contact.id", target = "contactId")
    CustomerDTO toDto(Customer customer);

    @Mapping(source = "contactId", target = "contact")
    @Mapping(target = "favouritestores", ignore = true)
    @Mapping(target = "favouriteproducts", ignore = true)
    Customer toEntity(CustomerDTO customerDTO);

    default Customer fromId(Long id) {
        if (id == null) {
            return null;
        }
        Customer customer = new Customer();
        customer.setId(id);
        return customer;
    }
}