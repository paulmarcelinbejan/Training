package com.paulmarcelinbejan.training.designpattern.structural.composite.example;

public class Triangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing Triangle with color " + color);
	}

}
