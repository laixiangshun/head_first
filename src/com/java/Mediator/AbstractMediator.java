package com.java.Mediator;

import java.util.Hashtable;

public abstract class AbstractMediator {

	protected Hashtable<String, AbstractColleague> cHashtable=new Hashtable<>();
	
	public void addColleague(String name,AbstractColleague c){
		this.cHashtable.put(name, c);
	}
	public void deleteColleague(String name){
		this.cHashtable.remove(name);
	}
	//ÖÐ½éÕß²Ù×÷
	public abstract void execute(String name,String method);
}
