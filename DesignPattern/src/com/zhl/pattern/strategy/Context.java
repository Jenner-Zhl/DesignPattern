package com.zhl.pattern.strategy;

public class Context {

	private float num;
	
	public void setNum(float n) {
		num = n;
	}
	
	public float getResult(Strategy strategy) {
		return strategy.showResult(num);
	}
}
