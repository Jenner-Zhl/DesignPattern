package com.zhl.pattern.factorymothod;

import com.zhl.pattern.Client;

public class FMClient extends Client {

	@Override
	public void run() {
		Creator creator = new Creator1();
		
		Product product = creator.createProduct();
		System.out.println("I got a " + product.show());
		
		creator = new Creator2();
		product = creator.createProduct();
		System.out.println("\n then I got a " + product.show());
		
	}

}
