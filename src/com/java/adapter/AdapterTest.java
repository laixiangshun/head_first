package com.java.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 类的适配器: Adapter
		 * Adapter类继承Sourse类和实现接口Targetable，将sourse中的功能拓展到Adapter
		 */
		Targetable targetable=new Adapter();
		targetable.method1();
		targetable.method2();
		/**
		 * 对象的适配器: wrapper
		 * 不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
		 */
		Source source=new Source();
		Targetable targetable2=new Wrapper(source);
		targetable2.method1();
		targetable2.method2();
		/**
		 * 接口适配器
		 * 借助于一个抽象类，该抽象类实现了该接口，实现了所有的方法，而我们不和原始的接口打交道，
		 * 只和该抽象类取得联系，所以我们写一个类，继承该抽象类，重写我们需要的方法就行了
		 */
		InterfaceAdapter adpter=new InterfaceAdapter();
		adpter.print();
	}

}
