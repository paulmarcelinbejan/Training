package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custom_mapping.Q1.classes;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalResponse {
	
    Long id;
    
    Long[] animalTypes;
    
}
