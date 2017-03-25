package com.zhl.pattern.decorator;

import com.zhl.pattern.Client;

public class DecoratorClient extends Client {

	@Override
	public void run() {
		Component a = new ConcreteComponent();
		Decorator da = new DecoratorA();
		Decorator db = new DecoratorB();
		da.setComponent(a);
		db.setComponent(da);
		
		db.operation();
	}

}
