package com.zhl.pattern.decorator;

public class DecoratorB extends Decorator {

	@Override
	public void operation() {
		mComponent.operation();
		System.out.println("operationB");
	}

}
