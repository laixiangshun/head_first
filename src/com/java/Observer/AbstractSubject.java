package com.java.Observer;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{

	private Vector<Observer> vector=new Vector<>();
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vector.add(observer);
	}

	@Override
	public void del(Observer observer) {
		// TODO Auto-generated method stub
		vector.remove(observer);
	}

	@Override
	public void notifyObservers() {
		//vector的遍历
		Enumeration<Observer> enumo=vector.elements();
		while (enumo.hasMoreElements()) {
			Observer observer = (Observer) enumo.nextElement();
			observer.update();
		}
		//map的几种遍历
		Map<String, Object> map=new HashMap<String, Object>();
		//只需要取map中的键key
		for(String key:map.keySet()){
			System.out.println("key="+key);
		}
		//同时需要键值
		for(Entry<String, Object> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		//只需要取值
		for(Object value:map.values()){
			System.out.println("value="+value);
		}
		//使用迭代器iterator
		Iterator<Entry<String, Object>> entry=map.entrySet().iterator();
		while(entry.hasNext()){
			Entry<String, Object>ent=entry.next();
			System.out.println("key="+ent.getKey()+"value="+ent.getValue());
		}
		//通过键找值
		for(String key: map.keySet()){
			Object value=map.get(key);
			System.out.println("key="+key+"value="+value);
		}
	}
	
}
