package com.java.status;

/**
 * ״̬ģʽ
 * �����״̬�ı�ʱ��ͬʱ�ı�����Ϊ
 * ͨ���ı�״̬����ò�ͬ����Ϊ��ͬʱ������ʾ���״̬
 * ״̬ģʽ���ճ��������õ�ͦ��ģ�����������վ��ʱ��������ʱϣ�����ݶ����ĳһ���ԣ��������ǵ�һЩ���ܣ�����˵�򵥵�Ȩ�޿��Ƶ�
 * @author lailai
 *
 */
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state=new State();
		Context context=new Context(state);
		state.setValue("state1");
		context.method();
		state.setValue("state2");
		context.method();
	}

}
