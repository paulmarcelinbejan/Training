package com.paulmarcelinbejan.training.designpattern.structural.composite.example;

public class Rectangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing Rectangle with color " + color);
	}

}