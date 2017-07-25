package com.java.singleton;

/**
 * ����ģʽ
 * ��JavaӦ���У����������ܱ�֤��һ��JVM�У��ö���ֻ��һ��ʵ������
 * ʡȥ��new��������������ϵͳ�ڴ��ʹ��Ƶ�ʣ�����GCѹ��
 * ���̰߳�ȫ�������࣬������ǰ���������̵߳Ļ����²�����
 * @author lailai
 *
 */
public class Singleton {

	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
	private static Singleton instance=null;
	 /* ˽�й��췽������ֹ��ʵ���� */  
	private Singleton(){};
	
	/* ��̬���̷���������ʵ�� */  
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	 /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
	public Object readResolve(){
		return instance;
	}
}
