package com.zhl.pattern.mediator;

public abstract class Widget {

	protected Mediator mMediator;
	
	public Widget(Mediator mediator) {
		mMediator = mediator;
	}
}
