package com.paulmarcelinbejan.training.designpattern.behavioral.observer.example;

import java.io.File;

public class Editor {

	public EventManager events;
	private File file;

	public Editor() {
		events = new EventManager("open", "save");
	}

	public void openFile(String filePath) {
		file = new File(filePath);
		events.notify("open", file);
	}

	public void saveFile() throws Exception {
		if (file == null) {
			throw new Exception("Please open a file first.");
		}
		events.notify("save", file);
	}

}
