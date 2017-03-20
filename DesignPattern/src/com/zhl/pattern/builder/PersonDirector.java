package com.zhl.pattern.builder;

public class PersonDirector {

	
	public void construct(PersonBuilder builder) {
		builder.buildPerson();
	}
}
