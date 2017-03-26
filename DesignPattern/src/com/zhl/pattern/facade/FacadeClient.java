package com.zhl.pattern.facade;

import com.zhl.pattern.Client;

public class FacadeClient extends Client {

	@Override
	public void run() {
		Facade facadeInterface = Facade.getInstance();
		facadeInterface.functionA();
	}

}
