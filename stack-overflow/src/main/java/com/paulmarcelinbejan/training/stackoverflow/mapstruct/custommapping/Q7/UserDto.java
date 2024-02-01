package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q7;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class UserDto {
	private String firstName;
	private String lastName;
	private ContactDto contact;
}