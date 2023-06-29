package com.paulmarcelinbejan.training.designpattern.structural.adapter.example;

import lombok.Getter;

@Getter
public class CilindroAdapter extends Cilindro {

	// Se la classe parent ha un AllArgsConstructor il raggio può essere settato
	// direttamente tramite il costruttore
	// Evitando di andarlo a calcolare ogni volta.
	public CilindroAdapter(Cubo cubo) {
		super(getRaggio(cubo));
		this.cubo = cubo;
	}

	private Cubo cubo;

	// Se la classe parent non ha l'AllArgsConstructor oppure questo non può essere
	// richiamato, è necessario fare l'override del metodo
//	@Override
//	public double getRaggio() {
//		return getRaggio(cubo);
//	}

	private static double getRaggio(Cubo cubo) {
		// Calcolo del raggio del cubo sfruttando la teoria di pitagora
		double apotema = cubo.getLato() / 2;
		return apotema * Math.sqrt(2);
	}

}