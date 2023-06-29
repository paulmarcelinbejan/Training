package com.paulmarcelinbejan.training.designpattern.structural.composite;

import com.paulmarcelinbejan.training.designpattern.structural.composite.example.Drawing;
import com.paulmarcelinbejan.training.designpattern.structural.composite.example.Rectangle;
import com.paulmarcelinbejan.training.designpattern.structural.composite.example.Shape;
import com.paulmarcelinbejan.training.designpattern.structural.composite.example.Triangle;

// Il Composite Pattern va usato:
//  - quando bisogna implementare una struttura di oggetti ad albero.
//  - quando si vuole che il codice cliente tratti uniformemente elementi semplici e complessi.
//
// Il Composite consente di comporre gli oggetti in strutture ad albero e di lavorare con queste strutture come se fossero oggetti singoli.
// Una delle abilità del composite pattern è quella di eseguire metodi ricorsivi per tutta la struttura e sommare i risultati.
public class CompositeDesignPattern {

	public static void main(String[] args) {
		Shape triangle = new Triangle();
		Shape triangle2 = new Triangle();
		Shape rectangle = new Rectangle();

		Drawing drawing = new Drawing();
		drawing.add(triangle);
		drawing.add(triangle2);
		drawing.add(rectangle);

		drawing.draw("Red");

		drawing.clear();

		drawing.add(triangle);
		drawing.add(rectangle);
		drawing.draw("Green");
	}

}
