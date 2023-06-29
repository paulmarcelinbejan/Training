package com.paulmarcelinbejan.training.designpattern.behavioral.chainofresponsibility.example;

public interface DispenseChain {

	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);

}