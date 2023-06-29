package com.paulmarcelinbejan.training.designpattern.creational.prototype.example;

public class TinyCircle extends Shape {

	public int radius;

	public TinyCircle() {

	}

	public TinyCircle(TinyCircle target) {
		super(target);
		if (target != null) {
			radius = target.radius;
		}
	}

	@Override
	public Shape clone() {
		return new TinyCircle(this);
	}

	@Override
	public boolean equals(Object object2) {
		if (!(object2 instanceof TinyCircle shape2) || !super.equals(object2)) {
			return false;
		}
		return shape2.radius == radius;
	}

}
