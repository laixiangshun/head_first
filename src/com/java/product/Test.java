package com.java.product;

/**
 * ������ģʽ����һ�����ӵĶ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ
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
