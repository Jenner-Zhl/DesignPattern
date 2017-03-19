package com.zhl.pattern.abstractfactory;

public class Factory2 extends Factory {

	@Override
	public ProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB2();
	}

}
