package com.java.Mediator;

/**
 * 中介者模式
 * 中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//创建一个中介者
		AbstractMediator mediator=new Mediator();
		//创建两个同事
		ColleagueA colleagueA=new ColleagueA(mediator);
		ColleagueB colleagueB=new ColleagueB(mediator);
		
		//中介者分别于两个同事取得联系
		mediator.addColleague("ColleagueA", colleagueA);
		mediator.addColleague("ColleagueB", colleagueB);
		
		//同事们互相工作
		colleagueA.self();
		colleagueA.out();
		System.out.println("-----------合作愉快\n");
		
		colleagueB.self();
		colleagueB.out();
		System.out.println("-------------合作愉快");
	}

}
