package com.paulmarcelinbejan.training.designpattern.structural.adapter.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Circonferenza {

	private double raggio;

	// true se il cilindro passa attraverso la circonferenza.
	public boolean eMaggioreDelCilindro(Cilindro cilindro) {
		return getRaggio() >= cilindro.getRaggio();
	}

}
