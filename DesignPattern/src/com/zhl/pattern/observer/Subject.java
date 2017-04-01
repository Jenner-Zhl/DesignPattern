package com.zhl.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	List<Observer> mObservers = new ArrayList<Observer>();
	
	String state = "";
	
	public void addObserver(Observer observer) {
		mObservers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		mObservers.remove(observer);
	}
	
	public void update() {
		for(Observer o : mObservers) {
			o.update(state);
		}
	}
}
