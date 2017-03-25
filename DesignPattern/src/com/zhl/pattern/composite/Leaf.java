package com.zhl.pattern.composite;

public class Leaf extends Component {

	public Leaf(String n) {
		super(n);
	}

	@Override
	public void add(Component child) {	}

	@Override
	public void remove(Component child) {	}

	@Override
	public void show(int depth) {
		for(int i=0; i<depth; i++) {
			System.out.print('-');
		}
		System.out.println(name);
	}

}
