package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q6;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, 
		injectionStrategy = InjectionStrategy.CONSTRUCTOR, 
		uses = { EnergyMixMapper.class })
public interface TariffMapper {

	TariffDto toDto(Tariff entity);

}
