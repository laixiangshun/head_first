package com.java.behaviour;

public class Plus extends AbstractCalculator implements ICalculator{

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int array[]=split(exp, "\\+");
		return array[0]+array[1];
	}

}
