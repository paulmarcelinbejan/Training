package com.paulmarcelinbejan.training.designpattern.behavioral.command;

import com.paulmarcelinbejan.training.designpattern.behavioral.command.example.CloseFileCommand;
import com.paulmarcelinbejan.training.designpattern.behavioral.command.example.FileInvoker;
import com.paulmarcelinbejan.training.designpattern.behavioral.command.example.FileSystemReceiver;
import com.paulmarcelinbejan.training.designpattern.behavioral.command.example.FileSystemReceiverUtil;
import com.paulmarcelinbejan.training.designpattern.behavioral.command.example.OpenFileCommand;
import com.paulmarcelinbejan.training.designpattern.behavioral.command.example.WriteFileCommand;

// Command Design Pattern
//
// Il Command pattern va usato:
//  - quando si desidera mettere in coda le operazioni, pianificarne l'esecuzione o eseguirle in remoto.
//  - quando volete implementare operazioni reversibili.
//
// Tramite il command pattern, una richiesta viene racchiusa in un oggetto come comando e passata all'Invoker.
// L'Invoker cerca l'oggetto appropriato che può gestire questo comando e passa il comando all'oggetto corrispondente, che lo esegue.
public class CommandDesignPattern {

	public static void main(String[] args) {

		// Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

		// creating command and associating with receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);

		// Creating invoker and associating with Command
		FileInvoker file = new FileInvoker(openFileCommand);

		// perform action on invoker object
		file.execute();

		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		file = new FileInvoker(writeFileCommand);
		file.execute();

		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		file = new FileInvoker(closeFileCommand);
		file.execute();

	}

}
