package com.zhl.pattern.mediator;

public class Button extends Widget {

	public Button(Mediator mediator) {
		super(mediator);
	}

	public void setEnabled(boolean enabled) {
		System.out.println("Button now " + (enabled?"enabled":"disabled"));
	}
}
