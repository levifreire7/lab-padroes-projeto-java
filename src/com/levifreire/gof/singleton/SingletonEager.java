package com.levifreire.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author Levi
 */
public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
