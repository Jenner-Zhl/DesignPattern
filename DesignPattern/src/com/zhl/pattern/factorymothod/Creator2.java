package com.zhl.pattern.factorymothod;

public class Creator2 extends Creator {

	@Override
	public Product createProduct() {
		return new Product2();
	}

}
