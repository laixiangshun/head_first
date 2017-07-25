package com.java.Mediator;

/**
 * �н���ģʽ
 * �н���ʹ��������Ҫ��ʽ���໥���ã��Ӷ�ʹ�������ɢ�����ҿ��Զ����ظı�����֮��Ľ���
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����һ���н���
		AbstractMediator mediator=new Mediator();
		//��������ͬ��
		ColleagueA colleagueA=new ColleagueA(mediator);
		ColleagueB colleagueB=new ColleagueB(mediator);
		
		//�н��߷ֱ�������ͬ��ȡ����ϵ
		mediator.addColleague("ColleagueA", colleagueA);
		mediator.addColleague("ColleagueB", colleagueB);
		
		//ͬ���ǻ��๤��
		colleagueA.self();
		colleagueA.out();
		System.out.println("-----------�������\n");
		
		colleagueB.self();
		colleagueB.out();
		System.out.println("-------------�������");
	}

}
