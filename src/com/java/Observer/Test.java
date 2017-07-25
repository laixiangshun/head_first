package com.java.Observer;

/*
 * 观察者模式
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！对象之间是一种一对多的关系。
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MySubject mySubject=new MySubject();
		mySubject.add(new Observer1());
		mySubject.add(new Observer2());
		
		mySubject.opration();//自身操作，等同于当前对象发生变化，并通知其相关对象发生变化
	}

}
