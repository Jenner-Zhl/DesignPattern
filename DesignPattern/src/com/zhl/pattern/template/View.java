package com.zhl.pattern.template;

public abstract class View {

	public void display() {
		onMeasure();
		onLayout();
		onDraw();
	}
	
	protected abstract void onDraw();
	
	public final void onMeasure() {
		System.out.println("measure");
	}
	
	public final void onLayout() {
		System.out.println("layout");
	}
}
