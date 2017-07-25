package com.java.singleton;

/**
 * ����ģʽ��ʹ��һ���ڲ�����ά�����������ö��߳�
 * @author lailai
 *
 */
public class Singleton2 {

	/* ˽�й��췽������ֹ��ʵ���� */  
	private Singleton2(){}
	//ʹ��һ���ڲ�����ά������
	private static class SingletonFactory{
		private static Singleton2 instance=new Singleton2();
	}
	/**
	 * ����ģʽʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ��
	 * �����ļ��ع������̻߳���ġ����������ǵ�һ�ε���getInstance��ʱ��
	 * JVM�ܹ������Ǳ�֤instanceֻ������һ�Σ����һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ����ϣ�
	 * �������ǾͲ��õ��Ķ��߳����⡣ͬʱ�÷���Ҳֻ���ڵ�һ�ε��õ�ʱ��ʹ�û�����ƣ������ͽ���˵���������
	 * @return
	 */
	//��ȡʵ��
	public static Singleton2 getInstance(){
		return SingletonFactory.instance;
	} 
	/* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return getInstance();  
    } 
    //���Է���
    private void Print(){
    	System.out.println("singleton");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton2 singleton=Singleton2.getInstance();
		singleton.Print();
	}

}
