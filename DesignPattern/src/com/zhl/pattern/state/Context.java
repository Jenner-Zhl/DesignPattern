package com.zhl.pattern.state;

public class Context {

	private State mState = new StateA();
	
	public void go() {
		mState.doSomeThing();
	}

	class StateA extends State {

		@Override
		public void doSomeThing() {
			System.out.println("State A");
			mState = new StateB();
		}
		
	}
	
	class StateB extends State {

		@Override
		public void doSomeThing() {
			System.out.println("State B");
			mState = new StateC();
		}
		
	}
	
	class StateC extends State {

		@Override
		public void doSomeThing() {
			System.out.println("State C \nEND");
		}
		
	}
}
