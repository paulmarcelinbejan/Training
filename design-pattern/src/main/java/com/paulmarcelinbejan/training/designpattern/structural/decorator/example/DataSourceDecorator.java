package com.paulmarcelinbejan.training.designpattern.structural.decorator.example;

public class DataSourceDecorator implements DataSource {

	private DataSource wrappee;

	DataSourceDecorator(DataSource source) {
		wrappee = source;
	}

	@Override
	public void writeData(String data) {
		wrappee.writeData(data);
	}

	@Override
	public String readData() {
		return wrappee.readData();
	}

}
