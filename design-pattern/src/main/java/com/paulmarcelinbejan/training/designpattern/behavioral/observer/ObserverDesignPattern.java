package com.paulmarcelinbejan.training.designpattern.behavioral.observer;

import com.paulmarcelinbejan.toolbox.constants.enums.DirectoryPath;
import com.paulmarcelinbejan.training.designpattern.behavioral.observer.example.Editor;
import com.paulmarcelinbejan.training.designpattern.behavioral.observer.example.EmailNotificationListener;
import com.paulmarcelinbejan.training.designpattern.behavioral.observer.example.LogOpenListener;

// Observer Design Pattern
//
// L'Observer pattern va usato:
// - quando alcuni oggetti dell'applicazione devono osservare altri, ma solo per un tempo limitato o in casi specifici.
// - quando le modifiche allo stato di un oggetto possono richiedere la modifica di altri oggetti e l'insieme effettivo di oggetti non è noto in anticipo o cambia dinamicamente.
//
// L'Observer consente di definire un meccanismo di sottoscrizione per notificare a più oggetti gli eventi che accadono all'oggetto che stanno osservando.
public class ObserverDesignPattern {

	public static void main(String[] args) {
		Editor editor = new Editor();

		editor.events
				.subscribe("open",
						new LogOpenListener(DirectoryPath.SRC_TEST_RESOURCES.value + "MyObserverTestFile.txt"));
		editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
