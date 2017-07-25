package com.java.Proxy;

/**
 * 代理模式，代理类
 * 代理模式就是多一个代理类出来，替原对象进行一些操作
 * @author lailai
 *
 */
public class Proxy implements Sourceable{

	private Source source;
	public Proxy(){
		this.source=new Source();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();//采用一个代理类调用原有的方法，且对产生的结果进行控制
		after();
	}
	private void before(){
		System.out.println("before proxy");
	}

	private void after(){
		System.out.println("after proxy");
	}
}
