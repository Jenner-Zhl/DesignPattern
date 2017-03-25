package com.zhl.pattern.adapter.bridge;

public class MobilePhone {

	private SoftWare mSoft;
	
	public void setSoftWare(SoftWare soft) {
		mSoft = soft;
	}
	
	public void runSoftWare () {
		mSoft.run();
	}
}
