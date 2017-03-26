package com.zhl.pattern.command;

import com.zhl.pattern.Client;

public class CommandClient extends Client {
	

	@Override
	public void run() {
		Invoker invoker = new Invoker();
		Command cmd = new ConcreteCommand();
		invoker.setCommand(cmd);
		invoker.invoke();
	}

}
