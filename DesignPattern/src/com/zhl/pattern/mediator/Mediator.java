package com.zhl.pattern.mediator;

public class Mediator {
	
	Button bt = new Button(this);
	Switch sc = new Switch(this);
	
	public void onSwitchChange(boolean on) {
		boolean enable = !on;
		bt.setEnabled(enable);
	}
}
