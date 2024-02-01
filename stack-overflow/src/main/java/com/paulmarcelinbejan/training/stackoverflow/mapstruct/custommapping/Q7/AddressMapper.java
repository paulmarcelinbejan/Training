package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q7;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AddressMapper {

	AddressMapper MAPPER = Mappers.getMapper(AddressMapper.class);

	AddressDto toDto(User user);

	User toEntity(AddressDto addressDto);

}
