package com.zhl.pattern.decorator;

public class DecoratorA extends Decorator {

	@Override
	public void operation() {
		mComponent.operation();
		System.out.println("operationA");
	}

}
