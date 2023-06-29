package com.paulmarcelinbejan.training.designpattern.behavioral.memento.example;

import lombok.Getter;

@Getter
public class TextWindow {

	private StringBuilder currentText;

	public TextWindow() {
		currentText = new StringBuilder();
	}

	public void addText(String text) {
		currentText.append(text);
	}

	public TextWindowMemento save() {
		return new TextWindowMemento(currentText.toString());
	}

	public void restore(TextWindowMemento save) {
		currentText = new StringBuilder(save.getText());
	}

}
