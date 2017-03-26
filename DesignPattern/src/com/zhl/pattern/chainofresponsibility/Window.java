package com.zhl.pattern.chainofresponsibility;

public class Window implements Clickable {

	@Override
	public void onClick() {
		System.out.println("Window handed click event");
	}

	@Override
	public void setSucessor(Clickable sucessor) {
		
	}

}
