package com.zhl.pattern.composite;

import java.util.LinkedList;

public class Composite extends Component {

	public Composite(String n) {
		super(n);
	}
	
	private LinkedList<Component> mChildren = new LinkedList<Component>();

	@Override
	public void add(Component child) {
		mChildren.add(child);
	}

	@Override
	public void remove(Component child) {
		mChildren.remove(child);
	}

	@Override
	public void show(int depth) {
		for(int i=0; i<depth; i++) {
			System.out.print('-');
		}
		System.out.println(name);
		for(Component temp : mChildren) {
			temp.show(depth + 1);
		}
	}

}
