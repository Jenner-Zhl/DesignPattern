package com.zhl.pattern.memento;

public class Caretaker {

	Memento mMenento;
	
	public void setState(Memento mem) {
		mMenento = mem;
	}
	
	public Memento getState() {
		return mMenento;
	}
}
