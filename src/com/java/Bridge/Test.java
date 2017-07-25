package com.java.Bridge;

/**
 * 桥接模式：方便多方向变化
 * 某些类型由于自身的逻辑，它具有两个或多个维度的变化，利用面向对象的技术来使得该类型能够轻松的沿着多个方向进行变化
 * 桥梁模式的用意是”将抽象化(Abstraction)与实现化(Implementation)脱耦，使得二者可以独立地变化
 * 抽象化：存在于多个实体中的共同的概念性联系，就是抽象化。作为一个过程，抽象化就是忽略一些信息，从而把不同的实体当做同样的实体对待。 
      实现化：抽象化给出的具体实现，就是实现化。 
      脱耦：所谓耦合，就是两个实体的行为的某种强关联。而将它们的强关联去掉，就是耦合的解脱，或称脱耦。
      在这里，脱耦是指将抽象化和实现化之间的耦合解脱开，或者说是将它们之间的强关联改换成弱关联。
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDriverManager driverManager=new MyDriverManager();
		MysqlDriver mysqlDriver=new MysqlDriver();
		driverManager.setDriver(mysqlDriver);
		driverManager.connect();
		
		DB2Driver db2Driver=new DB2Driver();
		driverManager.setDriver(db2Driver);
		driverManager.connect();
		
		//增加维度：在连接前后输出点东西，只需要增加MyDriverManager2
		MyDriverManager2 driverManager2=new MyDriverManager2();
		driverManager2.setDriver(mysqlDriver);
		driverManager2.connect();
	}

}
