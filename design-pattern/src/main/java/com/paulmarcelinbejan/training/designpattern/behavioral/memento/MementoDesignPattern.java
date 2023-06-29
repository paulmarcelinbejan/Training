package com.paulmarcelinbejan.training.designpattern.behavioral.memento;

import com.paulmarcelinbejan.training.designpattern.behavioral.memento.example.TextEditor;
import com.paulmarcelinbejan.training.designpattern.behavioral.memento.example.TextWindow;

// Memento Design Pattern (Snapshot)
//
// Il Memento pattern va usato:
//  - quando si desidera produrre snapshots dello stato dell'oggetto, per poter ripristinare l'oggetto ad uno stato precedente.
//
// Il Memento consente di salvare e ripristinare lo stato precedente di un oggetto senza rivelare i dettagli della sua implementazione.
public class MementoDesignPattern {

	public static void main(String[] args) {
		TextEditor textEditor = new TextEditor(new TextWindow());
		textEditor.write("Primo paragrafo\n");
		textEditor.write("Secondo paragrafo");
		textEditor.hitSave();

		textEditor.write("Terzo paragrafo");

		textEditor.hitUndo();

		textEditor.print();
	}

}
