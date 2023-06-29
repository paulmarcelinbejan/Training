package com.paulmarcelinbejan.training.designpattern.behavioral.memento.example;

public class TextEditor {

	private TextWindow textWindow;

	private TextWindowMemento savedTextWindow;

	public TextEditor(TextWindow textWindow) {
		this.textWindow = textWindow;
	}

	public void write(String text) {
		textWindow.addText(text);
	}

	public void print() {
		System.out.println(textWindow.getCurrentText());
	}

	public void hitSave() {
		savedTextWindow = textWindow.save();
	}

	public void hitUndo() {
		textWindow.restore(savedTextWindow);
	}

}
