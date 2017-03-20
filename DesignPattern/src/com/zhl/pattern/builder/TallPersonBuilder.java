package com.zhl.pattern.builder;

public class TallPersonBuilder extends PersonBuilder {

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
	public void buildPerson() {
		mPerson.setAge(25);
		mPerson.setHeight(198);
		mPerson.setWeight(70);
	}

	@Override
	public Person getPerson() {
		return mPerson;
	}

}
