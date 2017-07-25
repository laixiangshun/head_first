package com.java.Observer;

public class MySubject extends AbstractSubject{

	@Override
	public void opration() {
		// TODO Auto-generated method stub
		System.out.println("update self");//自身发生变化
		notifyObservers();
	}

}
