package com.zhl.pattern.mediator;

public class Switch extends Widget {

	private boolean mState;
	
	public Switch(Mediator mediator) {
		super(mediator);
	}
	
	public void setSwitchOn(boolean on) {
		mState = on;
		System.out.println("switch on :" + mState);
		
		mMediator.onSwitchChange(on);
		
	}

}
