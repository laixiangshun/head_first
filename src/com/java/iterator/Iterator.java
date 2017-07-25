package com.java.iterator;

public interface Iterator<T> {

	public T previous();
	
	public T next();
	
	public boolean hasNext();
	
	public T first();
}
