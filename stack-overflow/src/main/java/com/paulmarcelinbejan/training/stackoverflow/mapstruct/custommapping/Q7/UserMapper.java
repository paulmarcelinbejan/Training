package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q7;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, 
		uses = ContactMapper.class, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

	UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

	@Mapping(source = "user", target = "contact")
	UserDto toDto(User user);

	@Mapping(target = ".", source = "contact")
	@Mapping(target = ".", source = "contact.address")
	User toEntity(UserDto userDto);

}