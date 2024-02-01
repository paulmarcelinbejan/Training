package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q7;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = AddressMapper.class)
public interface ContactMapper {

	ContactMapper MAPPER = Mappers.getMapper(ContactMapper.class);

	@Mapping(source = "user", target = "address")
	ContactDto toDto(User user);

	@InheritInverseConfiguration
	User toEntity(ContactDto contactDto);

}
