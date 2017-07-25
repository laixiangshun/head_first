package com.java.product;

/**
 * 建造者模式：将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonDirector pd=new PersonDirector();
		Person person=pd.constructPerson(new ManBuilder());
		System.out.println(person.getHead());
		System.out.println(person.getBody());
		System.out.println(person.getFoot());
	}

}
