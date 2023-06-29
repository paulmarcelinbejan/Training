package com.paulmarcelinbejan.training.designpattern.creational.singleton.example;

// Thread Safe Singleton - Initialization-on-demand holder idiom
// L'idiom può essere utilizzato solo quando c'è la garanzia che il costruttore di SingletonThreadSafeV2 non vada in errore.
public class SingletonThreadSafeV2 {

	private SingletonThreadSafeV2() {

	}

	private static class LazyHolder {
		static final SingletonThreadSafeV2 INSTANCE = new SingletonThreadSafeV2();
	}

	public static SingletonThreadSafeV2 getInstance() {
		return LazyHolder.INSTANCE;
	}

	public void iAmNotStatic() {
		System.out.println("Whatever you want!");
	}

}
