package com.levifreire.gof;

import com.levifreire.gof.facade.Facade;
import com.levifreire.gof.singleton.SingletonEager;
import com.levifreire.gof.singleton.SingletonLazy;
import com.levifreire.gof.singleton.SingletonLazyHolder;
import com.levifreire.gof.strategy.Comportamento;
import com.levifreire.gof.strategy.ComportamentoAgressivo;
import com.levifreire.gof.strategy.ComportamentoDefensivo;
import com.levifreire.gof.strategy.ComportamentoNormal;
import com.levifreire.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {		
		
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);		
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		
		// Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Maria", "12345-000");
	}

}
