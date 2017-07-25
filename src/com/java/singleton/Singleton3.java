package com.java.singleton;

/**
 * 单例模式：在创建类的时候进行同步，所以只要将创建和getInstance()分开，单独为创建加synchronized关键字
 * @author lailai
 *
 */
public class Singleton3 {

	private static Singleton3 instance=null;
	private Singleton3(){}
	
	private static synchronized void syncInit(){
		if(instance==null){
			instance=new Singleton3();
		}
	}
	public static Singleton3 getInstance(){
		if(instance==null){
			syncInit();
		}
		return instance;
	}
	//测试
	private void print(){
		System.out.println("singleton");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton3 singleton=Singleton3.getInstance();
		singleton.print();
	}

}
