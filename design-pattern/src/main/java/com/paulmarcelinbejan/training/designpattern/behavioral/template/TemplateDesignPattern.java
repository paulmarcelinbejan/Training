package com.paulmarcelinbejan.training.designpattern.behavioral.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.paulmarcelinbejan.training.designpattern.behavioral.template.example.Facebook;
import com.paulmarcelinbejan.training.designpattern.behavioral.template.example.SocialNetwork;
import com.paulmarcelinbejan.training.designpattern.behavioral.template.example.Twitter;

// Template Design Pattern
//
// Il Template pattern va usato:
//  - quando si vuole permettere ai client di estendere solo particolari passi di un algoritmo, ma non l'intero algoritmo o la sua struttura.
//  - quando si hanno diverse classi che contengono algoritmi quasi identici con alcune piccole differenze. Di conseguenza, potrebbe essere necessario modificare tutte le classi quando l'algoritmo cambia.
//
// Il Template definisce lo scheletro di un algoritmo nella superclasse, ma consente alle sottoclassi di sovrascrivere passi specifici dell'algoritmo senza modificarne la struttura.
public class TemplateDesignPattern {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SocialNetwork socialNetwork = null;
		System.out.print("Input user name: ");
		String userName = reader.readLine();
		System.out.print("Input password: ");
		String password = reader.readLine();

		// Enter the message.
		System.out.print("Input message: ");
		String message = reader.readLine();

		System.out
				.println(
						"""

								Choose social network for posting message.
								1 - Facebook
								2 - Twitter""");
		int choice = Integer.parseInt(reader.readLine());

		// Create proper network object and send the message.
		if (choice == 1) {
			socialNetwork = new Facebook(userName, password);
		} else if (choice == 2) {
			socialNetwork = new Twitter(userName, password);
		}
		socialNetwork.post(message);
	}

}
