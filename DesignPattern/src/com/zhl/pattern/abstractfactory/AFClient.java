package com.zhl.pattern.abstractfactory;

public class AFClient {

	public static void run() {
		Factory factory = Factory.getFactory();
		
		ProductA a = factory.createProductA();
		ProductB b = factory.createProductB();
		
		System.out.println("I got a " + a.show() + " " + a + "\n" + b.show() + " " + b); 
	}
}
