package com.java.memorandum;

/**
 * ����¼ģʽ
 * ����һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ�����
 * ����¼�ֻࣺ�ܴ洢�������޸ĵȲ���
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Original original=new Original("wwww");
		//��������¼
		Storage storage=new Storage(original.createMemento());
		
		System.out.println("��ʼ״̬Ϊ"+original.getValue());
		original.setValue("bbbb");
		System.out.println("�޸ĺ��״̬��"+original.getValue());
		
		//�ָ�ԭʼ״̬
		original.restoreMemento(storage.getMemento());
		System.out.println("�ָ����ֵ"+original.getValue());
	}

}
