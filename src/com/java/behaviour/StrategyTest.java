package com.java.behaviour;

/**
 * ����ģʽ
 * ������һϵ���㷨������ÿ���㷨��װ������ʹ���ǿ����໥�滻�����㷨�ı仯����Ӱ�쵽ʹ���㷨�Ŀͻ�
 * ���û�ֻ��Ҫ�������ĸ��㷨
 * @author lailai
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp="23-5";
		ICalculator cal=new Minus();
		int result=cal.calculate(exp);
		System.out.println("result="+result);
		
		exp="5*8";
		cal=new Multiply();
		System.out.println("result="+cal.calculate(exp));
	}

}
