package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q7;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private Long id;

	private String firstName;

	private String lastName;

	private String email;

	private String mobile;

	private String street;

	private String city;

	private String apartment;

}
