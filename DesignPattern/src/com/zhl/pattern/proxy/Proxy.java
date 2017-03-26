package com.zhl.pattern.proxy;

public class Proxy extends Subject {

	private RealSubject mRealSubject = new RealSubject();
	@Override
	public void operation() {
		System.out.println("I'm Proxy, I let Realsubject do this");
		mRealSubject.operation();
	}

}
