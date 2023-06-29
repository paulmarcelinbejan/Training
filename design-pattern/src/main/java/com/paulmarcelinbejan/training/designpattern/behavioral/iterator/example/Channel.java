package com.paulmarcelinbejan.training.designpattern.behavioral.iterator.example;

public class Channel {

	private double frequency;
	private ChannelTypeEnum TYPE;

	public Channel(double freq, ChannelTypeEnum type) {
		frequency = freq;
		TYPE = type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getTYPE() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Frequency=" + frequency + ", Type=" + TYPE;
	}

}
