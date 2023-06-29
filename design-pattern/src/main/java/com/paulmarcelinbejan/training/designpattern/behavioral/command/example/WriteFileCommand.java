package com.paulmarcelinbejan.training.designpattern.behavioral.command.example;

public class WriteFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public WriteFileCommand(FileSystemReceiver fs) {
		fileSystem = fs;
	}

	@Override
	public void execute() {
		fileSystem.writeFile();
	}

}
