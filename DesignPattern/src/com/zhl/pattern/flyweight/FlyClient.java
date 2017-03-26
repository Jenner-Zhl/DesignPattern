package com.zhl.pattern.flyweight;

import com.zhl.pattern.Client;

public class FlyClient extends Client {

	@Override
	public void run() {
		String a = new String("test");
		String b = new String("test");
		a = a.intern();
		b = b.intern();
		
		System.out.println("a == b? " + (a == b));
	}

}
