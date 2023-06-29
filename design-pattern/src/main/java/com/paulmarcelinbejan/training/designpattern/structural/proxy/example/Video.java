package com.paulmarcelinbejan.training.designpattern.structural.proxy.example;

public class Video {

	public String id;
	public String title;
	public String data;

	Video(String id, String title) {
		this.id = id;
		this.title = title;
		data = "Random video.";
	}

}
