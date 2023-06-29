package com.paulmarcelinbejan.training.designpattern.creational.abstractfactory.example;

import java.awt.Button;
import java.awt.Checkbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
