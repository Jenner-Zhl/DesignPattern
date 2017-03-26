package com.zhl.pattern.command;

public class ConcreteCommand extends Command {
	
	private Receiver mReceiver = new Receiver();

	@Override
	public void Execute() {
		System.out.println("Excute comand");
		mReceiver.action();
	}

}
