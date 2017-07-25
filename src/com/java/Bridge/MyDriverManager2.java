package com.java.Bridge;

/**
 * 拓展维度，在连接之前和之后输出东西，不用改之前代码，只需要增加一个MyDriverManager2
 * @author lailai
 *
 */
public class MyDriverManager2 extends DriverManager{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("before connect");
		super.connect();
		System.out.println("after connect");
	}

}
