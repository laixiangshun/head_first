package com.java.Mediator;

public class ColleagueB extends AbstractColleague{

	public ColleagueB(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void self(){
		System.out.println("ͬ��b--�����Լ�����");
	}
	public void out(){
		System.out.println("ͬ��b--������a����");
		super.mediator.execute("ColleagueA", "self");
	}
}
