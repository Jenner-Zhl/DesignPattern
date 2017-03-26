package com.zhl.pattern.chainofresponsibility;

import com.zhl.pattern.Client;

public class ChainClient extends Client {

	@Override
	public void run() {
		Clickable a = new TextView();
		Clickable b = new Layout();
		Clickable c = new Window();
		a.setSucessor(b);
		b.setSucessor(c);
		
		a.onClick();
	}

}
