package com.zhl.pattern.memento;

public class Originator {

	String mState;
	
	public Memento createMemento() {
		Memento mem = new Memento();
		mem.setState(mState);
		
		return mem;
	}
	
	public void setMememto(Memento mem) {
		mState = mem.getState();
	}
}
