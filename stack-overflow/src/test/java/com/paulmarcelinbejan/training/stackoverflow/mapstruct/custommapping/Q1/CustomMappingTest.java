package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * https://stackoverflow.com/questions/75450839/springboot-mapstruct-mapping-entity-to-dto-with-relationship-entities
 */
class CustomMappingTest {

	@Test
	void run() {
		List<AnimalType> animalTypes = List.of(new AnimalType(1L), new AnimalType(2L), new AnimalType(3L));
		Animal animal = new Animal(1L, animalTypes);
		
		System.out.println(animal);
		
		AnimalResponse response = AnimalMapper.INSTANCE.toDto(animal);
		assertNotNull(response);
		
		System.out.println(response);
	}
	
}
