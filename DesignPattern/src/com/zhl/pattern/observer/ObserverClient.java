package com.zhl.pattern.observer;

import com.zhl.pattern.Client;

public class ObserverClient extends Client {

	@Override
	public void run() {
		ConcreteSubject s = new ConcreteSubject();
		Observer o1 = new AObserver();
		Observer o2 = new BObserver();
		
		s.addObserver(o1);
		s.addObserver(o2);
		
		s.changeState("1");
		s.changeState("2");
	}

}
