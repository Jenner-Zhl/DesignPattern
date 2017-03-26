package com.zhl.pattern.chainofresponsibility;

public class Layout implements Clickable {

	private Clickable mSucessor;
	private boolean clickable = false;
	
	public void setSucessor(Clickable sucessor) {
		mSucessor = sucessor;
	}
	
	@Override
	public void onClick() {
		if (clickable) {
			System.out.println("Layout handled");
		} else {
			if(mSucessor != null) {
				mSucessor.onClick();
			}
		}
	}

}
