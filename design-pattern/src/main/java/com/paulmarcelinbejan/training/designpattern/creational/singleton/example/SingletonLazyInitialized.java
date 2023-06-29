package com.paulmarcelinbejan.training.designpattern.creational.singleton.example;

// Lazy initialization
// L'istanza viene creata solo su richiesta e solo se non è già stata creata in precedenza.
// Questa soluzione però invalidare il Singleton Pattern se usato in un contesto multi-thread.
public class SingletonLazyInitialized {

	private static SingletonLazyInitialized INSTANCE;

	private SingletonLazyInitialized() {

	}

	public static SingletonLazyInitialized getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonLazyInitialized();
		}
		return INSTANCE;
	}

}
