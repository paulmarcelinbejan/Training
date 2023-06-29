package com.paulmarcelinbejan.training.designpattern.structural.facade.example;

import java.util.Map;

public class CodecFactory {

	public static final Map<String, Codec> CODEC_MAP = Map.of("mp4", newMPEG4Codec(), "ogg", newOggCodec());

	public static Codec extract(VideoFile file) {

		String type = file.getCodecType();

		return CODEC_MAP.get(type);

	}

	private static Codec newMPEG4Codec() {
		System.out.println("CodecFactory: extracting mpeg audio...");
		return new MPEG4CompressionCodec();
	}

	private static Codec newOggCodec() {
		System.out.println("CodecFactory: extracting ogg audio...");
		return new OggCompressionCodec();
	}

}
