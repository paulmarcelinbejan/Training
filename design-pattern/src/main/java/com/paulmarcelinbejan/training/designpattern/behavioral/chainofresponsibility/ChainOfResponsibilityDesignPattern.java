package com.paulmarcelinbejan.training.designpattern.behavioral.chainofresponsibility;

import java.util.Scanner;

import com.paulmarcelinbejan.training.designpattern.behavioral.chainofresponsibility.example.ATMDispenseChain;
import com.paulmarcelinbejan.training.designpattern.behavioral.chainofresponsibility.example.Currency;

// Chain Of Responsibility Design Pattern
//
// La Chain Of Responsibility pattern va usato:
//  - quando è essenziale eseguire diversi gestori in un ordine predefinito.
//  - quando si prevede che il programma debba elaborare diversi tipi di richieste in vari modi, ma i tipi esatti di richieste e le loro sequenze non sono noti a priori.
//
// La catena di responsabilità consente di passare le richieste lungo una catena di gestori. Ogni gestore che riceve una richiesta, decide se elaborarla o passarla al gestore successivo nella catena.
public class ChainOfResponsibilityDesignPattern {

	public static void main(String[] args) {
		ATMDispenseChain atmDispenser = new ATMDispenseChain();

		int amount = 0;
		System.out.println("Enter amount to dispense");
		try (Scanner input = new Scanner(System.in)) {
			amount = input.nextInt();
		}
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10s.");
			return;
		}
		// process the request
		atmDispenser.getC1().dispense(new Currency(amount));

	}

}
