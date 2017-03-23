package com.zhl.pattern.adapter;

import com.zhl.pattern.Client;

public class AdapterClient extends Client {

	@Override
	public void run() {
		Target target = new Adapter();
		System.out.println("target.request()");
		target.request();
	}

}
