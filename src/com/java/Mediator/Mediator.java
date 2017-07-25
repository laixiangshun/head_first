package com.java.Mediator;

public class Mediator extends AbstractMediator{

	@Override
	public void execute(String name, String method) {
		// TODO Auto-generated method stub
		if("self".equals(method)){
			if("ColleagueA".equals(name)){
				ColleagueA colleagueA=(ColleagueA)super.cHashtable.get(name);
				colleagueA.self();
			}else if("ColleagueB".equals(name)){
				ColleagueB colleagueB=(ColleagueB)super.cHashtable.get(name);
				colleagueB.self();
			}
		}else if("out".equals(method)){
			if("ColleagueA".equals(name)){
				ColleagueA colleagueA=(ColleagueA)super.cHashtable.get(name);
				colleagueA.out();
			}else if("ColleagueB".equals(name)){
				ColleagueB colleagueB=(ColleagueB)super.cHashtable.get(name);
				colleagueB.out();
			}
		}
	}

}
