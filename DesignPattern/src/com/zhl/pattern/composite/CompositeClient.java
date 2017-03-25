package com.zhl.pattern.composite;

import com.zhl.pattern.Client;

public class CompositeClient extends Client {

	@Override
	public void run() {
		Component root = new Composite("root");
		Component system = new Composite("system");
		root.add(system);
		Component file = new Leaf("file");
		root.add(file);
		Component data = new Composite("data");
		root.add(data);
		Component etc = new Composite("etc");
		system.add(etc);
		Leaf file1 = new Leaf("file1");
		Leaf file2 = new Leaf("file2");
		etc.add(file2);
		etc.add(file1);
		Leaf file3 = new Leaf("file3");
		data.add(file3);
		
		root.show(0);
	}

}
