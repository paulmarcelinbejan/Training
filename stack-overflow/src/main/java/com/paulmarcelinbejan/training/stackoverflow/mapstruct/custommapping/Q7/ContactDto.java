package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q7;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class ContactDto {
	private String email;
	private String mobile;
	private AddressDto address;
}
