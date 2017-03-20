package com.zhl.pattern.builder;

import com.zhl.pattern.Client;

public class BuildClient extends Client {

	@Override
	public void run() {
		PersonDirector pd = new PersonDirector();
		PersonBuilder pbs[] = {
				new ThinPersonBuilder(),
				new OldPersonBuilder(),
				new TallPersonBuilder()};
		pbs[0].setName("Thin");
		pbs[1].setName("Old");
		pbs[2].setName("Tall");
		//pbs[2].setAge(18);
		
		for (int i=0; i<pbs.length; i++) {
			pd.construct(pbs[i]);
			Person person = pbs[i].getPerson();
			System.out.println("get a person named " + person.getName() + ", Height:" 
					+ person.getHeight() + "cm Age:" + person.getAge() + "years Weight:"
					+ person.getWeight() + "kg");
		}
		
	}

}
