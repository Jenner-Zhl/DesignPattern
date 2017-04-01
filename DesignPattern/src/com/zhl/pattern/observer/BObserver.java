package com.zhl.pattern.observer;

public class BObserver implements Observer {

	@Override
	public void update(String state) {
		System.out.println("B obeserved state:" + state);
	}

}
