package com.java.Bridge;

/**
 * ��չά�ȣ�������֮ǰ��֮��������������ø�֮ǰ���룬ֻ��Ҫ����һ��MyDriverManager2
 * @author lailai
 *
 */
public class MyDriverManager2 extends DriverManager{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("before connect");
		super.connect();
		System.out.println("after connect");
	}

}
