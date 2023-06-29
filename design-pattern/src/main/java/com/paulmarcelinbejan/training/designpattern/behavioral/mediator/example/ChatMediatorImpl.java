package com.paulmarcelinbejan.training.designpattern.behavioral.mediator.example;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;

	public ChatMediatorImpl() {
		users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String msg, User user) {
		for (User u : users) {
			// message should not be received by the user sending it
			if (u != user) {
				u.receive(msg);
			}
		}
	}

}
