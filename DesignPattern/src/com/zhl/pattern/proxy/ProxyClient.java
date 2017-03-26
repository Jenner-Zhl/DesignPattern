package com.zhl.pattern.proxy;

import com.zhl.pattern.Client;

public class ProxyClient extends Client {

	@Override
	public void run() {
		Proxy proxy = new Proxy();
		proxy.operation();
	}

}
