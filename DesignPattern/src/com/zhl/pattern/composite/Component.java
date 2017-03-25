package com.zhl.pattern.composite;

public abstract class Component {
	protected String name;
	
	public Component(String n) {
		name = n;
	}

	public abstract void add(Component child);
	public abstract void remove(Component child);
	public abstract void show(int depth);
}
