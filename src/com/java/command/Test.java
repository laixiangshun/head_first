package com.java.command;

/**
 * ����ģʽ
 * ����ģʽ��Ŀ�ľ��Ǵﵽ����ķ����ߺ�ִ����֮����ʵ�������ִ�зֿ�
 * ���ӣ�ʿ������ʿ��ִ������
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Receiver receiver=new Receiver();
		Command command=new MyCommand(receiver);
		Invoker invoker=new Invoker(command);
		invoker.action();
	}

}
