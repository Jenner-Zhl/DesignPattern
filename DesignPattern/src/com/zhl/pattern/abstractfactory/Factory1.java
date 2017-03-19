package com.zhl.pattern.abstractfactory;

public class Factory1 extends Factory {

	@Override
	public ProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public ProductB createProductB() {
		return new ProductB1();
	}

}
