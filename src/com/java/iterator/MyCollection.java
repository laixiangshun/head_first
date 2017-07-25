package com.java.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<T> implements Collection<T>{

	private List<T> list=new ArrayList<>();
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(this);
	}

	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
		return list.get(i);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public void add(T obj) {
		// TODO Auto-generated method stub
		if(obj!=null){
			list.add(obj);
		}
	}

}
