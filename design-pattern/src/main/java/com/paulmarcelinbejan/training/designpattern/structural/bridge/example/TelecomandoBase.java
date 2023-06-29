package com.paulmarcelinbejan.training.designpattern.structural.bridge.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TelecomandoBase implements Telecomando {

	protected Dispositivo dispositivo;

	@Override
	public void powerOnOff() {
		System.out.println("Telecomando: pulsante accensione / spegnimento");
		if (!dispositivo.isAcceso()) {
			dispositivo.accendi();
		} else {
			dispositivo.spegni();
		}
	}

	@Override
	public void volumeSu() {
		System.out.println("Telecomando: volume su");
		if (dispositivo.isAcceso()) {
			dispositivo.setVolume(dispositivo.getVolume() + 10);
		}
	}

	@Override
	public void volumeGiu() {
		System.out.println("Telecomando: volume giù");
		if (dispositivo.isAcceso()) {
			dispositivo.setVolume(dispositivo.getVolume() - 10);
		}
	}

	@Override
	public void canaleSu() {
		System.out.println("Telecomando: canale su");
		if (dispositivo.isAcceso()) {
			dispositivo.setCanale(dispositivo.getCanale() + 1);
		}
	}

	@Override
	public void canaleGiu() {
		System.out.println("Telecomando: canale giù");
		if (dispositivo.isAcceso()) {
			dispositivo.setCanale(dispositivo.getCanale() - 1);
		}
	}

}
