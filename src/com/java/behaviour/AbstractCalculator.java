package com.java.behaviour;

/**
 * 辅助类：将表达式根据指定的分隔符分割并转换为int数组
 * @author lailai
 *
 */
public abstract class AbstractCalculator {

	public int[] split(String exp,String opt){
		String array[]=exp.split(opt);
		int arrayInt[] =new int[2];
		arrayInt[0]=Integer.parseInt(array[0]);
		arrayInt[1]=Integer.parseInt(array[1]);
		return arrayInt;
	}
}
