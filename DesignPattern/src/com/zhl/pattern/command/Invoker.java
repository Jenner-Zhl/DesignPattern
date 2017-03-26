package com.zhl.pattern.command;

public class Invoker {

	private Command mCommand;
	
	public void setCommand(Command cmd) {
		mCommand = cmd;
	}
	
	public void invoke() {
		if (mCommand != null) {
			mCommand.Execute();
		}
	}
}
