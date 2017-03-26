package com.zhl.pattern.proxy;

public class RealSubject extends Subject {

	@Override
	public void operation() {
		System.out.println("Real subject do the operation");
	}

}
