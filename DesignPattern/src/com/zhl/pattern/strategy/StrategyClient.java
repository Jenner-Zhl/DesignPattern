package com.zhl.pattern.strategy;

import com.zhl.pattern.Client;

public class StrategyClient extends Client {

	@Override
	public void run() {
		Strategy strategy = new Strategy() {
			
			@Override
			public float showResult(float num) {
				
				return (float) (num * 0.8);
			}
		};
		
		Context context = new Context();
		context.setNum(5);
		System.out.println("result:" + context.getResult(strategy));
	}

}
