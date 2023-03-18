package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalType {

	private Long id;
	
}
