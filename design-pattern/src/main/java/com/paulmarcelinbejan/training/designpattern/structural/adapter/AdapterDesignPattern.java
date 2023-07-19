package com.paulmarcelinbejan.training.designpattern.structural.adapter;

import com.paulmarcelinbejan.training.designpattern.structural.adapter.example.Cilindro;
import com.paulmarcelinbejan.training.designpattern.structural.adapter.example.CilindroAdapter;
import com.paulmarcelinbejan.training.designpattern.structural.adapter.example.Circonferenza;
import com.paulmarcelinbejan.training.designpattern.structural.adapter.example.Cubo;

// L'Adapter Pattern va usato:
//  - quando vuoi riutilizzare delle classi preesistenti, ma la sua interfaccia non è compatibile con il resto del codice.
//  - quando vuoi riutilizzare delle sottoclassi a cui mancano delle funzionalità comuni che non possono essere aggiunte alla superclasse.
//
// L'Adapter (conosciuto anche come Wrapper) consente ad oggetti con interfacce incompatibili di collaborare.
//
// Ad esempio immaginiamo che la nostra applicazione scarichi dei dati da diverse fonti, in formato csv, per poi crearci dei grafici per l'utente finale.
// Ad un certo punto decidiamo di migliorare la nostra applicazione con una libreria di terze parti, il problema è che questa libreria lavora solo con il formato json.
//
// La soluzione in questo caso risulta proprio quella di creare un adapter.
public class AdapterDesignPattern {

	public static void main(String[] args) {
		// Round fits round, no surprise.
		Circonferenza circonferenza = new Circonferenza(5);
		Cilindro cilindro = new Cilindro(5);
		if (circonferenza.eMaggioreDelCilindro(cilindro)) {
			System.out.println("Il cilindro di raggio 5 può attraversare la circonferenza di raggio 5");
		}

		Cubo cuboPiccolo = new Cubo(3);
		Cubo cuboMedio = new Cubo(7);
		Cubo cuboGrande = new Cubo(10);
		// circonferenza.eMaggioreDelCilindro(piccoloCubo); // Won't compile.
		// circonferenza.eMaggioreDelCilindro(grandeCubo); // Won't compile.

		// Adapter solves the problem.
		CilindroAdapter cuboPiccoloAdapter = new CilindroAdapter(cuboPiccolo);
		CilindroAdapter cuboMedioAdapter = new CilindroAdapter(cuboMedio);
		CilindroAdapter cuboGrandeAdapter = new CilindroAdapter(cuboGrande);

		printLog(circonferenza, cuboPiccoloAdapter);
		printLog(circonferenza, cuboMedioAdapter);
		printLog(circonferenza, cuboGrandeAdapter);
	}

	private static void printLog(Circonferenza circonferenza, CilindroAdapter cilindroAdapter) {
		double latoDelCubo = cilindroAdapter.getCubo().getLato();
		String puo_nonpuo = circonferenza.eMaggioreDelCilindro(cilindroAdapter) ? " può" : " non può";
		System.out.println("Il cubo di lato " + latoDelCubo + puo_nonpuo + " attraversare la circonferenza di raggio 5");
	}

}
