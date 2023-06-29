package com.paulmarcelinbejan.training.designpattern.behavioral.mediator.example;

public interface ChatMediator {

	void sendMessage(String msg, User user);

	void addUser(User user);

}
