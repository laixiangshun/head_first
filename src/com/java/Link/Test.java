package com.java.Link;

/**
 * ������ģʽ
 * �ж������ÿ��������ж���һ����������ã������ͻ��γ�һ������
 * �������������ϴ��ݣ�ֱ��ĳһ����������������
 * ���Ƿ����߲���������������Ǹ�����ᴦ����������ԣ�������ģʽ����ʵ�֣��������ͻ��˵�����£���ϵͳ���ж�̬�ĵ���
 * ��һ��ʱ�̣�����ֻ������һ�����󴫸���һ�����󣬶����������������
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHandler m1=new MyHandler("h1");
		MyHandler m2=new MyHandler("h2");
		MyHandler m3=new MyHandler("h3");
		m1.setHandler(m2);
		m2.setHandler(m3);
		m1.opreation();
	}

}
