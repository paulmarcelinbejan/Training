package com.paulmarcelinbejan.training.designpattern.structural.facade.example;

import lombok.Getter;

@Getter
public class VideoFile {

	private String name;
	private String codecType;

	public VideoFile(String name) {
		this.name = name;
		codecType = name.substring(name.indexOf(".") + 1);
	}

}
