package com.zhl.pattern.state;

import com.zhl.pattern.Client;

public class StateClient extends Client {

	@Override
	public void run() {
		Context ctx = new Context();
		ctx.go();
		ctx.go();
		ctx.go();
	}

}
