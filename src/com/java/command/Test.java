package com.java.command;

/**
 * 命令模式
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开
 * 例子：士官命令士兵执行任务
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Receiver receiver=new Receiver();
		Command command=new MyCommand(receiver);
		Invoker invoker=new Invoker(command);
		invoker.action();
	}

}
