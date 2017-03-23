package com.zhl.pattern.adapter;

public class Adapter extends Target {
	
	private Adaptee mAdaptee = new Adaptee();

	@Override
	public void request() {
		mAdaptee.specicalRequest();
	}

	
}
