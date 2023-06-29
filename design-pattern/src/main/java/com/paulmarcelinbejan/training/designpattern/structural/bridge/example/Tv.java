package com.paulmarcelinbejan.training.designpattern.structural.bridge.example;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Tv implements Dispositivo {

	private boolean acceso = false;
	private int volume = 30;
	@Setter
	private int canale = 1;

	@Override
	public void accendi() {
		acceso = true;
	}

	@Override
	public void spegni() {
		acceso = false;
	}

	@Override
	public void setVolume(int volume) {
		if (volume > 100) {
			this.volume = 100;
		} else if (volume < 0) {
			this.volume = 0;
		} else {
			this.volume = volume;
		}
	}

	@Override
	public void printStato() {
		System.out.println("------------------------------------");
		System.out.println("| Tv");
		System.out.println("| Sono " + (acceso ? "acceso" : "spento"));
		System.out.println("| Il volume corrente è " + volume + "%");
		System.out.println("| Il canale corrente è " + canale);
		System.out.println("------------------------------------\n");
	}
}
