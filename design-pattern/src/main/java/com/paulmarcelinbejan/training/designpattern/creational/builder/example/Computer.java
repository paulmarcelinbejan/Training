package com.paulmarcelinbejan.training.designpattern.creational.builder.example;

import lombok.Getter;

@Getter
public class Computer {

	// required parameters
	private String HDD;
	private String RAM;

	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder builder) {
		HDD = builder.HDD;
		RAM = builder.RAM;
		boolean isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		isBluetoothEnabled = builder.isBluetoothEnabled;
	}

	public static ComputerBuilder builder(String HDD, String RAM) {
		return new ComputerBuilder(HDD, RAM);
	}

	// Builder Class
	public static class ComputerBuilder {

		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			HDD = hdd;
			RAM = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

}
