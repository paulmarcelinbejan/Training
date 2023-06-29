package com.paulmarcelinbejan.training.designpattern.creational.abstractfactory;

import java.awt.Button;
import java.awt.Checkbox;

import com.paulmarcelinbejan.training.designpattern.creational.abstractfactory.example.GUIFactory;

// Abstract Factory Design Pattern
//
// L'Abstract Factory pattern va usato:
//  - quando il nostro codice deve lavorare con varie famiglie di prodotti, ma non vuoi che dipenda sulle classi concrete, in quando potrebbero non essere conosciute a priori, o semplicemente per favorire l'estensibilità del codice in futuro.
//
// L'Abstract Factory design pattern è molto simile al Factory, a parte il fatto che è un factory of factories.
public class AbstractFactoryDesignPattern {

	private Button button;
	private Checkbox checkbox;

	public AbstractFactoryDesignPattern(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}

}
