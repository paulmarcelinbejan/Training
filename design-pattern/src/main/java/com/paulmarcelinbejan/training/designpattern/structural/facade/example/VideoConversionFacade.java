package com.paulmarcelinbejan.training.designpattern.structural.facade.example;

import java.io.File;
import java.util.Map;

public class VideoConversionFacade {

	public static final Map<
			String,
			Codec> CODEC_MAP = Map.of("mp4", new MPEG4CompressionCodec(), "ogg", new OggCompressionCodec());

	public File convertVideo(String fileName, String format) {

		System.out.println("VideoConversionFacade: conversion started.");

		VideoFile file = new VideoFile(fileName);

		Codec sourceCodec = CodecFactory.extract(file);
		Codec destinationCodec = CODEC_MAP.get(format);

		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
		File result = (new AudioMixer()).fix(intermediateResult);

		System.out.println("VideoConversionFacade: conversion completed.");

		return result;
	}

}