package com.java.Observer;

public interface Subject {

	public void add(Observer observer);
	
	public void del(Observer observer);
	
	//֪ͨ���й۲���
	public void notifyObservers();
	
	//�������
	public void opration();
}
