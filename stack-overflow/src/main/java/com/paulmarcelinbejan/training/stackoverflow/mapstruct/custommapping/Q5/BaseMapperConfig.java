package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q5;

import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@MapperConfig
public interface BaseMapperConfig {
	
	@Mapping(target = "name.firstName", source = "firstName")
	@Mapping(target = "name.lastName", source = "lastName")
	BaseDTO toDTO(BaseEntity entity);
	
}