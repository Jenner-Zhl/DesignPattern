package com.zhl.pattern.singleton;

import com.zhl.pattern.Client;

public class SingletonClient extends Client {

	@Override
	public void run() {
		Singleton a, b, c;
		a = Singleton.getInstance();
		b = Singleton.getInstance();
		c = Singleton.getInstance();
		
		System.out.println(a + "\n" + b + "\n" + c);
	}

}
