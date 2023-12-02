package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q5;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = BaseMapperConfig.class)
public interface ChildMapper {
	
	ChildMapper INSTANCE = Mappers.getMapper(ChildMapper.class);
	
	@InheritConfiguration
	ChildDTO toDTO(ChildEntity entity);
	
}
