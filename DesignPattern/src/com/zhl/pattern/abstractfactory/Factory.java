package com.zhl.pattern.abstractfactory;

public abstract class Factory {

	private static Factory sFactory = new Factory1();
	//private static Factory sFactory = new Factory2();
	
	public static Factory getFactory () {
		return sFactory;
	}
	
	public abstract ProductA createProductA();
	
	public abstract ProductB createProductB();
}
