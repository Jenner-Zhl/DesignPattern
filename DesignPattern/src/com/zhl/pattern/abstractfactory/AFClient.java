package com.zhl.pattern.abstractfactory;

import com.zhl.pattern.Client;

public class AFClient extends Client {

	public void run() {
		Factory factory = Factory.getFactory();
		
		ProductA a = factory.createProductA();
		ProductB b = factory.createProductB();
		
		System.out.println("I got a " + a.show() + " " + a + "\n" + b.show() + " " + b); 
	}
}
