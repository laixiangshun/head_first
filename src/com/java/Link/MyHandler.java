package com.java.Link;

public class MyHandler extends AbstractHandler implements Handler{

	private String name;
	public MyHandler(String name){
		this.name=name;
	}
	@Override
	public void opreation() {
		// TODO Auto-generated method stub
		System.out.println(name+"detal");
		if(getHandler()!=null){
			getHandler().opreation();
		}
	}

}
