package com.java.product;

public class ManBuilder implements PersonBuilder{

	Person person;
	public ManBuilder(){
		person=new Person();
	}
	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("�������˵�ͷ��");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("�������˵�����");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("�������˵Ľ�");
	}

	@Override
	public Person buildPerson() {
		return person;
	}

}
