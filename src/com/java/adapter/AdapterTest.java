package com.java.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * ���������: Adapter
		 * Adapter��̳�Sourse���ʵ�ֽӿ�Targetable����sourse�еĹ�����չ��Adapter
		 */
		Targetable targetable=new Adapter();
		targetable.method1();
		targetable.method2();
		/**
		 * �����������: wrapper
		 * ���̳�Source�࣬���ǳ���Source���ʵ�����Դﵽ��������Ե�����
		 */
		Source source=new Source();
		Targetable targetable2=new Wrapper(source);
		targetable2.method1();
		targetable2.method2();
		/**
		 * �ӿ�������
		 * ������һ�������࣬�ó�����ʵ���˸ýӿڣ�ʵ�������еķ����������ǲ���ԭʼ�Ľӿڴ򽻵���
		 * ֻ�͸ó�����ȡ����ϵ����������дһ���࣬�̳иó����࣬��д������Ҫ�ķ���������
		 */
		InterfaceAdapter adpter=new InterfaceAdapter();
		adpter.print();
	}

}
