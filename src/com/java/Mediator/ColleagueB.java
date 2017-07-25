package com.java.Mediator;

public class ColleagueB extends AbstractColleague{

	public ColleagueB(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void self(){
		System.out.println("同事b--》做自己的事");
	}
	public void out(){
		System.out.println("同事b--》请求a做事");
		super.mediator.execute("ColleagueA", "self");
	}
}
