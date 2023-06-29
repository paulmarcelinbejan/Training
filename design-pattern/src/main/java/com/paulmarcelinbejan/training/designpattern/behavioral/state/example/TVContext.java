package com.paulmarcelinbejan.training.designpattern.behavioral.state.example;

public class TVContext implements State {

	private State tvState;

	public void setState(State state) {
		tvState = state;
	}

	public State getState() {
		return tvState;
	}

	@Override
	public void doAction() {
		tvState.doAction();
	}

}
