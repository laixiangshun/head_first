package com.java.status;

public class State {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	public void method(){
		System.out.println("第一种状态执行方法");
	}
	public void method1(){
		System.out.println("第二种状态执行方法");
	}
}
