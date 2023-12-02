package com.paulmarcelinbejan.training.designpattern.structural.decorator;

import com.paulmarcelinbejan.training.designpattern.structural.decorator.example.DataSourceDecorator;
import com.paulmarcelinbejan.training.designpattern.structural.decorator.example.EncryptionDecorator;
import com.paulmarcelinbejan.training.designpattern.structural.decorator.example.FileDataSource;

import io.github.paulmarcelinbejan.toolbox.utils.io.enums.DirectoryPath;

// Il Decorator Pattern va usato:
//  - quando ho bisogno di aggiungere comportamenti aggiuntivi agli oggetti in fase di esecuzione, senza rompere il codice che utilizza questi oggetti.
//  - quando risulta scomodo o impossibile estendere il comportamento di un oggetto usando l'ereditarietà
//
// Il Decorator consente di associare nuovi comportamenti agli oggetti, collocandoli all'interno di speciali oggetti wrapper che contengono i comportamenti.
public class DecoratorDesignPattern {

	public static void main(String[] args) {

		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

		FileDataSource fileToWrite = new FileDataSource(
				DirectoryPath.SRC_TEST_RESOURCES.value + "DecoratorDesignPattern.txt");

		DataSourceDecorator fileToWriteEncoded = new EncryptionDecorator(fileToWrite);

		fileToWriteEncoded.writeData(salaryRecords);

		FileDataSource fileToRead = new FileDataSource(
				DirectoryPath.SRC_TEST_RESOURCES.value + "DecoratorDesignPattern.txt");

		DataSourceDecorator fileToReadEncoded = new EncryptionDecorator(fileToRead);

		String salaryRecordsEncrypted = fileToRead.readData();
		String salaryRecordsDecrypted = fileToReadEncoded.readData();

		System.out.println("- Input ----------------");
		System.out.println(salaryRecords);
		System.out.println("- Encoded --------------");
		System.out.println(salaryRecordsEncrypted);
		System.out.println("- Decoded --------------");
		System.out.println(salaryRecordsDecrypted);

	}

}
