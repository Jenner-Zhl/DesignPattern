package com.zhl.pattern.builder;

public class ThinPersonBuilder extends PersonBuilder {

	@Override
	public void setAge(int age) {
		mPerson.setAge(age);

	}

	@Override
	public void setName(String name) {
		mPerson.setName(name);
	}

	@Override
	public void setHeight(int height) {
		mPerson.setHeight(height);
	}

	@Override
	public void setWeight(int weight) {
		mPerson.setWeight(weight);
	}

	@Override
	public Person getPerson() {
		return mPerson;
	}

	@Override
	public void buildPerson() {
		mPerson.setAge(20);
		mPerson.setHeight(166);
		mPerson.setWeight(45);
	}

}
