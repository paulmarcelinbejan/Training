package com.paulmarcelinbejan.training.designpattern.structural.bridge;

import com.paulmarcelinbejan.training.designpattern.structural.bridge.example.Dispositivo;
import com.paulmarcelinbejan.training.designpattern.structural.bridge.example.Radio;
import com.paulmarcelinbejan.training.designpattern.structural.bridge.example.TelecomandoAvanzato;
import com.paulmarcelinbejan.training.designpattern.structural.bridge.example.TelecomandoBase;
import com.paulmarcelinbejan.training.designpattern.structural.bridge.example.Tv;

// Il Bridge Pattern va usato:
//  - quando vuoi dividere e organizzare una classe monolitica che ha diverse variandi di alcune funzionalità.
//  - quando vuoi estendere una classe in diverse dimensioni ortogonali (indipendenti).
//
// Il Bridge Pattern consente di dividere una classe di grandi dimensioni o un insieme di classi strettamente correlate
// in due gerarchie separate - astrazione e implementazione - che possono essere sviluppate indipendentemente l'una dall'altra.
//
// Esempio: Ho un applicazione che gestisce due forme geometriche, il cubo e il cilindro.
// Decido poi di aggiungere il colore blu, ed il colore rosso.
// Invece di creare CuboBlu, CuboRosso, CilindroBlu, CilindroRosso (avendo una crescita esponenziale delle classi all'aumentare delle forme geometriche e/o dei colori).
// creerò le classi relative alla forma geometrica, al cui interno ci sarà la variabile colore (interfaccia che sarà implementata da Blu, Rosso ecc.)
// Dunque avrò tante classi quanto il numero di forme geometriche, ed il numero dei colori che vorrò implementare.
public class BridgeDesignPattern {

	public static void main(String[] args) {
		testDispositivoConTelecomandoBase(new Tv());
		testDispositivoConTelecomandoAvanzato(new Tv());
		System.out.println("\n\n\n");
		testDispositivoConTelecomandoBase(new Radio());
		testDispositivoConTelecomandoAvanzato(new Radio());
	}

	private static void testDispositivoConTelecomandoBase(Dispositivo dispositivo) {
		System.out.println("Test con TelecomandoBase");
		TelecomandoBase telecomandoBase = new TelecomandoBase(dispositivo);
		telecomandoBase.powerOnOff();
		telecomandoBase.volumeSu();
		dispositivo.printStato();
	}

	public static void testDispositivoConTelecomandoAvanzato(Dispositivo dispositivo) {
		System.out.println("Tests con TelecomandoAvanzato");
		TelecomandoAvanzato telecomandoAvanzato = new TelecomandoAvanzato(dispositivo);
		telecomandoAvanzato.powerOnOff();
		telecomandoAvanzato.volumeSu();
		telecomandoAvanzato.muto();
		dispositivo.printStato();
	}

}
