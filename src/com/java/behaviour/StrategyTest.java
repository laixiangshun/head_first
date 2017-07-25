package com.java.behaviour;

/**
 * 策略模式
 * 定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户
 * 部用户只需要决定用哪个算法
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
