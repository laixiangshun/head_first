package com.java.factory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provider provider=new SendMailFactory();
		Sender sender=provider.produce();
		sender.send();
	}

}
