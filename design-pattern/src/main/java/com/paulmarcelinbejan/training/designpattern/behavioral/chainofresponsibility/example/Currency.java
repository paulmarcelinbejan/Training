package com.paulmarcelinbejan.training.designpattern.behavioral.chainofresponsibility.example;

import lombok.Getter;

public class Currency {

	@Getter
	private int amount;

	public Currency(int amt) {
		amount = amt;
	}

}
