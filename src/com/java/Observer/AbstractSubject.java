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
		//vector�ı���
		Enumeration<Observer> enumo=vector.elements();
		while (enumo.hasMoreElements()) {
			Observer observer = (Observer) enumo.nextElement();
			observer.update();
		}
		//map�ļ��ֱ���
		Map<String, Object> map=new HashMap<String, Object>();
		//ֻ��Ҫȡmap�еļ�key
		for(String key:map.keySet()){
			System.out.println("key="+key);
		}
		//ͬʱ��Ҫ��ֵ
		for(Entry<String, Object> entry:map.entrySet()){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		//ֻ��Ҫȡֵ
		for(Object value:map.values()){
			System.out.println("value="+value);
		}
		//ʹ�õ�����iterator
		Iterator<Entry<String, Object>> entry=map.entrySet().iterator();
		while(entry.hasNext()){
			Entry<String, Object>ent=entry.next();
			System.out.println("key="+ent.getKey()+"value="+ent.getValue());
		}
		//ͨ������ֵ
		for(String key: map.keySet()){
			Object value=map.get(key);
			System.out.println("key="+key+"value="+value);
		}
	}
	
}
