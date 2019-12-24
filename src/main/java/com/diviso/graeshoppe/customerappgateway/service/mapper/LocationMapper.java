package com.diviso.graeshoppe.customerappgateway.service.mapper;



import org.mapstruct.*;

import com.diviso.graeshoppe.customerappgateway.client.product.model.Location;
import com.diviso.graeshoppe.customerappgateway.client.product.model.LocationDTO;

/**
 * Mapper for the entity Location and its DTO LocationDTO.
 */
@Mapper(componentModel = "spring", uses = {AddressMapper.class})
public interface LocationMapper extends EntityMapper<LocationDTO, Location> {

    @Override
	@Mapping(source = "address.id", target = "addressId")
    LocationDTO toDto(Location location);

    @Override
	@Mapping(source = "addressId", target = "address")
    Location toEntity(LocationDTO locationDTO);

    default Location fromId(Long id) {
        if (id == null) {
            return null;
        }
        Location location = new Location();
        location.setId(id);
        return location;
    }
}