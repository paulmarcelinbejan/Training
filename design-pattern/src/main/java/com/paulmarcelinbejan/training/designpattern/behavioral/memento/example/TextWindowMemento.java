package com.paulmarcelinbejan.training.designpattern.behavioral.memento.example;

import lombok.Getter;

@Getter
public class TextWindowMemento {

	private String text;

	public TextWindowMemento(String text) {
		this.text = text;
	}

}
