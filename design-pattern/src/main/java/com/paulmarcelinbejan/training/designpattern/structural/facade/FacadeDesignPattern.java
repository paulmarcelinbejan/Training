package com.paulmarcelinbejan.training.designpattern.structural.facade;

import java.io.File;

import com.paulmarcelinbejan.training.designpattern.structural.facade.example.VideoConversionFacade;

// Il Facade Pattern va usato:
//  - quando si ha bisogno di un interfaccia limitata ma semplice per un sottoinsieme complesso.
//
// Il Facade fornisce un'interfaccia semplificata a una libreria, a un framework o a un qualsiasi altro insieme complesso di classi.
public class FacadeDesignPattern {

	public static void main(String[] args) {
		VideoConversionFacade converter = new VideoConversionFacade();
		File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
	}

}
