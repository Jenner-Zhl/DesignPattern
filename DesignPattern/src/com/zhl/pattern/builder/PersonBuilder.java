package com.zhl.pattern.builder;

public abstract class PersonBuilder {

	protected Person mPerson = new Person();
	
	public abstract void setAge(int age);
	
	public abstract void setName(String name);
	
	public abstract void setHeight(int height);
	
	public abstract void setWeight(int weight);
	
	public abstract void buildPerson();
	
	public abstract Person getPerson();
}
