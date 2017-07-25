package com.java.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sourceable sourceable=new Source();
		Sourceable sc=new Decorator(sourceable);
		sc.method();
	}
}
