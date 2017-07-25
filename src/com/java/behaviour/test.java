package com.java.behaviour;

/**
 * 模板方法模式
 * 一个抽象类中，有一个主方法，再定义1…n个方法，可以是抽象的，也可以是实际的方法，
 * 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
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
