package com.paulmarcelinbejan.training.designpattern.creational.abstractfactory.example;

import java.awt.Button;
import java.awt.Checkbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
