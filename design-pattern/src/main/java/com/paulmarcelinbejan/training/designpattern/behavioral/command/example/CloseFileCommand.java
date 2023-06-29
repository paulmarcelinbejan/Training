package com.paulmarcelinbejan.training.designpattern.behavioral.command.example;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public CloseFileCommand(FileSystemReceiver fs) {
		fileSystem = fs;
	}

	@Override
	public void execute() {
		fileSystem.closeFile();
	}

}