package com.paulmarcelinbejan.training.designpattern.structural.bridge.example;

public interface Dispositivo {

	boolean isAcceso();

	void accendi();

	void spegni();

	int getVolume();

	void setVolume(int percentuale);

	int getCanale();

	void setCanale(int canale);

	void printStato();

}
