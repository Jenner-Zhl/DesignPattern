package com.zhl.pattern.decorator;

public abstract class Decorator extends Component {

	protected Component mComponent;
	
	public void setComponent(Component component) {
		mComponent = component;
	}
}
