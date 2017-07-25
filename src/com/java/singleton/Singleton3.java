package com.java.singleton;

/**
 * ����ģʽ���ڴ������ʱ�����ͬ��������ֻҪ��������getInstance()�ֿ�������Ϊ������synchronized�ؼ���
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
	//����
	private void print(){
		System.out.println("singleton");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton3 singleton=Singleton3.getInstance();
		singleton.print();
	}

}
