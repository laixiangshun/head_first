package com.java.iterator;

public class MyIterator<T> implements Iterator<T>{

	private Collection<T> collection;
	private int pos=-1;
	
	public MyIterator(Collection<T> collection1){
		this.collection=collection1;
	}
	@Override
	public T previous() {
		if(pos>0){
			pos--;
		}
		return collection.get(pos);
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		if(pos<collection.size()-1){
			pos++;
		}
		return collection.get(pos);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(pos<collection.size()-1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		pos=0;
		return collection.get(pos);
	}

}
