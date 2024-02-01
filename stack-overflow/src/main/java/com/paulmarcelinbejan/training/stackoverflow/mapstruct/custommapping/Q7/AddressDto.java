package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q7;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class AddressDto {
	private String street;
	private String city;
	private String apartment;
}
