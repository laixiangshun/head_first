package com.java.behaviour;

public abstract class AbstractCalculator2 {

	//主方法，实现对本类其他方法的调用
	public final int calcalator(String exp,String opt){
		int array[]=split(exp, opt);
		return calcalate(array[0], array[1]);
	}
	//被子类重写的方法
	abstract public int calcalate(int num1,int num2);
	
	public int[] split(String exp,String opt){
		String array[]=exp.split(opt);
		int arrayInt[] =new int[2];
		arrayInt[0]=Integer.parseInt(array[0]);
		arrayInt[1]=Integer.parseInt(array[1]);
		return arrayInt;
	}
}
