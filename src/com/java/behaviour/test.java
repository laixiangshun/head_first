package com.java.behaviour;

/**
 * ģ�巽��ģʽ
 * һ���������У���һ�����������ٶ���1��n�������������ǳ���ģ�Ҳ������ʵ�ʵķ�����
 * ����һ���࣬�̳иó����࣬��д���󷽷���ͨ�����ó����࣬ʵ�ֶ�����ĵ���
 * @author lailai
 *
 */
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exp="6+2";
		AbstractCalculator2 cal=new Plus2();
		System.out.println("result="+cal.calcalator(exp, "\\+"));
	}

}
