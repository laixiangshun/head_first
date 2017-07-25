package com.java.factory;

public class Builder_Test {

	 public static void main(String[] args) {
		 Builder builder=new Builder();
		 builder.produceMailSender(10);
		 builder.print(builder.getList());
	 }
}
