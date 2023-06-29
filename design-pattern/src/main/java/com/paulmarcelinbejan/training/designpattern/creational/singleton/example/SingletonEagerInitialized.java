package com.paulmarcelinbejan.training.designpattern.creational.singleton.example;

// Eager initialization
// L'istanza viene creata nel momento in cui viene caricata le classe, il che significa che per contro, l'istanza verrà creata anche se mai utilizzata.
public class SingletonEagerInitialized {

	private static final SingletonEagerInitialized INSTANCE = new SingletonEagerInitialized();

	private SingletonEagerInitialized() {

	}

	public static SingletonEagerInitialized getInstance() {
		return INSTANCE;
	}

}
