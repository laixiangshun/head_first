package com.java.Mediator;

public class ColleagueA extends AbstractColleague{

	public ColleagueA(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void self(){
		System.out.println("同事a--》做自己的事");
	}
	public void out(){
		System.out.println("同事a---》与同事b做事");
		super.mediator.execute("ColleagueB", "self");
	}
}
