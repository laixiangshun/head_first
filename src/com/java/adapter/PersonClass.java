package com.java.adapter;

public class PersonClass implements Person{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("获得person信息");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "tom";
	}

}
