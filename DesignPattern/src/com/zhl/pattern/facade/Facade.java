package com.zhl.pattern.facade;

public class Facade {
	private static Facade sFacade;
	
	private Facade(){};
	
	public static Facade getInstance() {
		if (sFacade == null) {
			sFacade = new Facade();
		}
		
		return sFacade;
	}

	
	public void functionA() {
		System.out.println("Fisrt:");
		new SubSystem1().method1();
		System.out.println("then:");
		new Subsystem2().method2();
	}
}
