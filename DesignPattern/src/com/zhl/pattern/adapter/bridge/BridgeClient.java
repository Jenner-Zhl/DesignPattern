package com.zhl.pattern.adapter.bridge;

import com.zhl.pattern.Client;

public class BridgeClient extends Client {

	@Override
	public void run() {
		MobilePhone mp = new NokiaPhone();
		mp.setSoftWare(new SMS());
		mp.runSoftWare();
		
		mp = new LenovoPhone();
		mp.setSoftWare(new FileManager());
		mp.runSoftWare();
	}

}
