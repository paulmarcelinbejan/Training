package com.paulmarcelinbejan.training.designpattern.creational.abstractfactory.example;

import java.awt.Button;
import java.awt.Checkbox;

public interface GUIFactory {

	Button createButton();

	Checkbox createCheckbox();

}
