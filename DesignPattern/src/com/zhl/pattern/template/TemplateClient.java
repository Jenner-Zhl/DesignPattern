package com.zhl.pattern.template;

import com.zhl.pattern.Client;

public class TemplateClient extends Client {

	@Override
	public void run() {
		View v = new MyView();
		v.display();
	}

}
