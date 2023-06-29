package com.paulmarcelinbejan.training.designpattern.creational.builder;

import com.paulmarcelinbejan.training.designpattern.creational.builder.example.Computer;

import lombok.Getter;

// Builder Desing Pattern
//
// Il Builder Pattern è stato introdotto per risolvere alcuni problemi legati al factory quando un oggetto contiene molti attributi.
//  - difficoltà a mantenere l'ordine dei parametri
//  - alcuni parametri potrebbero essere opzionali
//
// Il Builder Pattern va usato:
//  - quando vogliamo avere la possibilità di costruire diverse rappresentazioni dello stesso oggetto.
@Getter
public class BuilderDesignPattern {

	private Computer computer;

	public void tryBuilder() {
		Computer
				.builder("512", "16")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true)
				.build();
	}

}
