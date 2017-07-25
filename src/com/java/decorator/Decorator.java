package com.java.decorator;

/**
 * װ��ģʽ
 * Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿ�/�̳У���ͬ���ͣ�����װ�ζ�����б�װ�ζ����ʵ��
 * ��Ҫ��չһ����Ĺ���
 * ��̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ
 * ȱ�㣺�����������ƵĶ��󣬲����Ŵ�
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
		//װ�����޸ĵĹ���
		System.out.println("before decorator");
		sourceable.method();
		System.out.println("after decorator");
		method2();
	}
	//װ����ӵĹ���
	public void method2(){
		System.out.println("װ����ģʽ");
	}

}
