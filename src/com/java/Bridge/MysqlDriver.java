package com.java.Bridge;

public class MysqlDriver implements Driver{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect to mysql");
	}

}
