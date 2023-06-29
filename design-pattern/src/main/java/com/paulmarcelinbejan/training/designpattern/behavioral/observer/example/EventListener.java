package com.paulmarcelinbejan.training.designpattern.behavioral.observer.example;

import java.io.File;

public interface EventListener {

	void update(String eventType, File file);

}
