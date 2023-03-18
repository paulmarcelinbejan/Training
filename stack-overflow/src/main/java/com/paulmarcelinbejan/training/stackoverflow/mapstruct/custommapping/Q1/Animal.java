package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q1;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Animal {
	   
	Long id;
	   
    List<AnimalType> animalTypes;

}
