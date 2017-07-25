package com.java.Facade;

/**
 * 外观模式
 * 解决类与类之间的依赖关系
 * 外观模式就是将他们的关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer computer=new Computer();
		computer.startup();
		computer.shutdown();
	}

}
