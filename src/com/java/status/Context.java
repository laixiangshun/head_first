package com.java.status;

public class Context {

	private State state;
	public Context(State state){
		this.state=state;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void method(){
		System.out.println("µ±Ç°×´Ì¬Îª£º"+state.getValue());
		if(state.getValue().equals("state1")){
			state.method();
		}else if(state.getValue().equals("state2")){
			state.method1();
		}
	}
}
