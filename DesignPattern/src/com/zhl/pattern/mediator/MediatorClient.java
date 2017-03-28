package com.zhl.pattern.mediator;

import com.zhl.pattern.Client;

public class MediatorClient extends Client {

	@Override
	public void run() {
		Mediator mediator = new Mediator();
		mediator.sc.setSwitchOn(true);
		System.out.println("--------");
		mediator.sc.setSwitchOn(false);
	}

}
