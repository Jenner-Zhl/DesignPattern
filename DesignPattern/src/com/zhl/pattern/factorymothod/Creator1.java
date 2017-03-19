package com.zhl.pattern.factorymothod;

public class Creator1 extends Creator {

	@Override
	public Product createProduct() {
		return new Product1();
	}

}
