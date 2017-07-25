package com.java.memorandum;

/**
 * 备忘录模式
 * 保存一个对象的某个状态，以便在适当的时候恢复对象
 * 备忘录类：只能存储，不能修改等操作
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Original original=new Original("wwww");
		//创建备忘录
		Storage storage=new Storage(original.createMemento());
		
		System.out.println("初始状态为"+original.getValue());
		original.setValue("bbbb");
		System.out.println("修改后的状态是"+original.getValue());
		
		//恢复原始状态
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的值"+original.getValue());
	}

}
