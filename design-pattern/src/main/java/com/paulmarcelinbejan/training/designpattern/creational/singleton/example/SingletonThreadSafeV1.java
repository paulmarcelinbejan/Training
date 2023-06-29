package com.paulmarcelinbejan.training.designpattern.creational.singleton.example;

// Thread Safe Singleton
// L'istanza viene creata solo su richiesta e solo se non è già stata creata in precedenza, syncronizzando l'istanza tra i vari thread.
public class SingletonThreadSafeV1 {

	private static SingletonThreadSafeV1 INSTANCE = new SingletonThreadSafeV1();

	public static SingletonThreadSafeV1 getInstanceUsingDoubleLocking() {
		if (INSTANCE == null) {
			synchronized (SingletonThreadSafeV1.class) {
				if (INSTANCE == null) {
					INSTANCE = new SingletonThreadSafeV1();
				}
			}
		}
		return INSTANCE;
	}

}
