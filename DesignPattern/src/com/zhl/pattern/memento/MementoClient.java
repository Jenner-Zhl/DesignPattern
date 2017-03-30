package com.zhl.pattern.memento;

import com.zhl.pattern.Client;

public class MementoClient extends Client {

	@Override
	public void run() {
		Originator originator = new Originator();
		originator.mState = "aaa";
		
		System.out.println("my state:" + originator.mState);
		
		Caretaker caretaker = new Caretaker();
		caretaker.setState(originator.createMemento());
		originator.mState = "bbb";
		
		System.out.println("my state:" + originator.mState);
		
		originator.setMememto(caretaker.getState());
		System.out.println("recoverd my state:" + originator.mState);
	}

}
