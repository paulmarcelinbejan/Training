package com.paulmarcelinbejan.training.designpattern.creational.prototype.example;

import java.util.Objects;

public abstract class Shape {

	public int x;
	public int y;
	public String color;

	public Shape() {
	}

	public Shape(Shape target) {
		if (target != null) {
			x = target.x;
			y = target.y;
			color = target.color;
		}
	}

	@Override
	public abstract Shape clone();

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof Shape shape2)) {
			return false;
		}
		return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
	}

}