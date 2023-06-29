package com.paulmarcelinbejan.training.designpattern.behavioral.mediator.example;

public abstract class User {

	protected ChatMediator mediator;
	protected String name;

	protected User(ChatMediator med, String name) {
		mediator = med;
		this.name = name;
	}

	public abstract void send(String msg);

	public abstract void receive(String msg);

}
