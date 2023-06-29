package com.paulmarcelinbejan.training.designpattern.behavioral.state.example;

public class TVStartState implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}

}
