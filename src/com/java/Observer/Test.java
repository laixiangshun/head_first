package com.java.Observer;

/*
 * �۲���ģʽ
 * ��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯������֮����һ��һ�Զ�Ĺ�ϵ��
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MySubject mySubject=new MySubject();
		mySubject.add(new Observer1());
		mySubject.add(new Observer2());
		
		mySubject.opration();//�����������ͬ�ڵ�ǰ�������仯����֪ͨ����ض������仯
	}

}
