package com.java.iterator;

/**
 * 迭代模式
 * 迭代器模式就是顺序访问聚集中的对象，一般来说，集合中非常常见
 * 需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> collection=new MyCollection<>();
		collection.add("A");
		collection.add("B");
		collection.add("C");
		collection.add("D");
		collection.add("E");
		collection.add("F");
		Iterator<String> it=collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
