package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q1;

import java.util.Arrays;
import java.util.List;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AnimalMapper extends BaseMapper<Animal, AnimalResponse> {

	AnimalMapper INSTANCE = Mappers.getMapper(AnimalMapper.class);

	@Override
	@Named("toDto")
	@Mapping(source = "animalTypes", target = "animalTypes", qualifiedByName = "toArray")
	AnimalResponse toDto(Animal entity);

	@Override
	@IterableMapping(qualifiedByName = "toDto")
	List<AnimalResponse> toDtoList(List<Animal> entityList);

	@Override
	@Named("toEntity")
	@Mapping(source = "animalTypes", target = "animalTypes", qualifiedByName = "toArrayList")
	Animal toEntity(AnimalResponse dto);

	@Override
	@IterableMapping(qualifiedByName = "toEntity")
	List<Animal> toEntityList(List<AnimalResponse> dtoList);

	@Named("toArray")
	default Long[] toArray(List<AnimalType> animalTypes) {
		return animalTypes
				.stream()
				.map(AnimalType::getId)
				.toArray(size -> new Long[size]);
	}

	@Named("toArrayList")
	default List<AnimalType> toArrayList(Long[] animalTypes) {
		return Arrays
				.stream(animalTypes)
				.map(AnimalType::new)
				.toList();
	}

}