package com.paulmarcelinbejan.training.designpattern.behavioral.chainofresponsibility.example;

public class Dollar10Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 10) {
			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			if (remainder != 0) {
				chain.dispense(new Currency(remainder));
			}
		} else {
			chain.dispense(cur);
		}
	}

}
