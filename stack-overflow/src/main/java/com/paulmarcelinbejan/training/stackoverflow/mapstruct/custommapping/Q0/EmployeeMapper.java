package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q0;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface EmployeeMapper {
	
	default Employee toResponse(Employee domain) {
		return domain;
	}
	
}
