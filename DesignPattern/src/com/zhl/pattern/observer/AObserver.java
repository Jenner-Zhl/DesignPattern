package com.zhl.pattern.observer;

public class AObserver implements Observer {

	@Override
	public void update(String state) {
		System.out.println("A obeserved state:" + state);
	}

}
