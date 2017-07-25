package com.java.Proxy;

/**
 * ����ģʽ��������
 * ����ģʽ���Ƕ�һ���������������ԭ�������һЩ����
 * @author lailai
 *
 */
public class Proxy implements Sourceable{

	private Source source;
	public Proxy(){
		this.source=new Source();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();//����һ�����������ԭ�еķ������ҶԲ����Ľ�����п���
		after();
	}
	private void before(){
		System.out.println("before proxy");
	}

	private void after(){
		System.out.println("after proxy");
	}
}
