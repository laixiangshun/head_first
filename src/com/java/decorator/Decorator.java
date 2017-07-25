package com.java.decorator;

/**
 * 装饰模式
 * 要求装饰对象和被装饰对象实现同一个接口/继承（相同类型，），装饰对象持有被装饰对象的实例
 * 需要扩展一个类的功能
 * 动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删
 * 缺点：产生过多相似的对象，不易排错
 * @author lailai
 *
 */
public class Decorator implements Sourceable{
	
	private Sourceable sourceable;
	public Decorator(Sourceable sourceable){
		super();
		this.sourceable=sourceable;
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		//装饰着修改的功能
		System.out.println("before decorator");
		sourceable.method();
		System.out.println("after decorator");
		method2();
	}
	//装饰添加的功能
	public void method2(){
		System.out.println("装饰着模式");
	}

}
