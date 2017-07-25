package com.java.iterator;

public interface Collection<T> {

	public Iterator<T> iterator();
	
	public T get(int i);
	
	public int size();
	
	public void add(T obj);
}
