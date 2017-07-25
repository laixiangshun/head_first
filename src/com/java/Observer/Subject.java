package com.java.Observer;

public interface Subject {

	public void add(Observer observer);
	
	public void del(Observer observer);
	
	//通知所有观察者
	public void notifyObservers();
	
	//自身操作
	public void opration();
}
