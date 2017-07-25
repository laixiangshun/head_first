package com.java.singleton;

/**
 * 单例模式
 * 在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在
 * 省去了new操作符，降低了系统内存的使用频率，减轻GC压力
 * 无线程安全保护的类，如果我们把它放入多线程的环境下不适用
 * @author lailai
 *
 */
public class Singleton {

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static Singleton instance=null;
	 /* 私有构造方法，防止被实例化 */  
	private Singleton(){};
	
	/* 静态工程方法，创建实例 */  
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	 /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
	public Object readResolve(){
		return instance;
	}
}
