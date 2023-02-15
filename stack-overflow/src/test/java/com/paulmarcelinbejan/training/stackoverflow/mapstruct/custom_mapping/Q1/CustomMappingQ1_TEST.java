package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custom_mapping.Q1;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.paulmarcelinbejan.training.stackoverflow.mapstruct.custom_mapping.Q1.classes.Animal;
import com.paulmarcelinbejan.training.stackoverflow.mapstruct.custom_mapping.Q1.classes.AnimalMapper;
import com.paulmarcelinbejan.training.stackoverflow.mapstruct.custom_mapping.Q1.classes.AnimalResponse;
import com.paulmarcelinbejan.training.stackoverflow.mapstruct.custom_mapping.Q1.classes.AnimalType;

/**
 * https://stackoverflow.com/questions/75450839/springboot-mapstruct-mapping-entity-to-dto-with-relationship-entities
 */
class CustomMappingQ1_TEST {

	@Test
	void run() {
		List<AnimalType> animalTypes = List.of(new AnimalType(1L), new AnimalType(2L), new AnimalType(3L));
		Animal animal = new Animal(1L, animalTypes);
		
		System.out.println(animal);
		
		AnimalResponse response = AnimalMapper.INSTANCE.toDto(animal);
		
		System.out.println(response);
	}
	
}
