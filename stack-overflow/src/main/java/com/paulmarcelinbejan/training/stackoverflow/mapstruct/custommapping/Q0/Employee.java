package com.paulmarcelinbejan.training.stackoverflow.mapstruct.custommapping.Q0;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Employee {

	private Long id;

	private Integer nationalityId;

	private Long residenceId;

	private Integer sexTypeId;

	private Integer bankBranchId;

	private LocalDate birthDate;

	private String name;

	private String surname;

	private String email;

	private String phoneNumber;

}