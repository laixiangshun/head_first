package com.java.Mediator;

public class ColleagueA extends AbstractColleague{

	public ColleagueA(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void self(){
		System.out.println("ͬ��a--�����Լ�����");
	}
	public void out(){
		System.out.println("ͬ��a---����ͬ��b����");
		super.mediator.execute("ColleagueB", "self");
	}
}
