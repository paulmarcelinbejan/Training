package com.paulmarcelinbejan.training.personal.Q1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Car {

	private String name;

	protected void printNameOfParentClass() {
		System.out.println(Car.class.getSimpleName());
	}

	protected void printNameOfSubclass() {
		System.out.println(getClass().getSimpleName());
	}

}
