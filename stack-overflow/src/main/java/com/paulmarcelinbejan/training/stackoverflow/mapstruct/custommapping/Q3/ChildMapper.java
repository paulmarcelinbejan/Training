package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q3;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ChildMapper {
   
	ChildMapper INSTANCE = Mappers.getMapper(ChildMapper.class);
	
    ChildDTO toDTO(Child child);
    
    Child toEntity(ChildDTO dto);
    
}
