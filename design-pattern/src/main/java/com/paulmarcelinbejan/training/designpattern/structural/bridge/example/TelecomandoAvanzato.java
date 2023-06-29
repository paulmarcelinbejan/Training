package com.paulmarcelinbejan.training.designpattern.structural.bridge.example;

public class TelecomandoAvanzato extends TelecomandoBase {

	public TelecomandoAvanzato(Dispositivo dispositivo) {
		super(dispositivo);
	}

	public void muto() {
		System.out.println("Telecomando: tasto muto");
		if (dispositivo.isAcceso()) {
			dispositivo.setVolume(0);
		}
	}

}
