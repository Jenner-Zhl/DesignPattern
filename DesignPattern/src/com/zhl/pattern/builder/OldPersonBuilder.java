package com.zhl.pattern.builder;

public class OldPersonBuilder extends PersonBuilder {

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
		mPerson.setAge(60);
		mPerson.setHeight(160);
		mPerson.setWeight(50);
	}

	@Override
	public Person getPerson() {
		return mPerson;
	}

}
