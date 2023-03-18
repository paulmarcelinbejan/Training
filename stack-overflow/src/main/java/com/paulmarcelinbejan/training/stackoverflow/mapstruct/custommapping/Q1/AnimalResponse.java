package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q1;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalResponse {
	
    Long id;
    
    Long[] animalTypes;
    
}
