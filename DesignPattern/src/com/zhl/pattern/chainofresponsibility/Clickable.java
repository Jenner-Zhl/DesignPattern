package com.zhl.pattern.chainofresponsibility;

public interface Clickable {

	public abstract void onClick();
	
	public abstract void setSucessor(Clickable sucessor);
}
