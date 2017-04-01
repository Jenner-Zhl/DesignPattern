package com.zhl.pattern.observer;

public class ConcreteSubject extends Subject {

	public void changeState(String newState) {
		state = newState;
		
		update();
	}
}
