package com.java.product;

public class ManBuilder implements PersonBuilder{

	Person person;
	public ManBuilder(){
		person=new Person();
	}
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("建造男人的头部");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("建造男人的身体");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("建造男人的脚");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
