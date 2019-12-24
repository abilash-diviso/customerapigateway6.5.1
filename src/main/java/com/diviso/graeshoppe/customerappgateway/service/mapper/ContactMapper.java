package com.diviso.graeshoppe.customerappgateway.service.mapper;



import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.customer.model.Contact;
import com.diviso.graeshoppe.customerappgateway.client.customer.model.ContactDTO;

/**
 * Mapper for the entity Contact and its DTO ContactDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ContactMapper extends EntityMapper<ContactDTO, Contact> {



    default Contact fromId(Long id) {
        if (id == null) {
            return null;
        }
        Contact contact = new Contact();
        contact.setId(id);
        return contact;
    }
}