package com.java.Bridge;

/**
 * �Ž�ģʽ������෽��仯
 * ĳЩ��������������߼�����������������ά�ȵı仯�������������ļ�����ʹ�ø������ܹ����ɵ����Ŷ��������б仯
 * ����ģʽ�������ǡ�������(Abstraction)��ʵ�ֻ�(Implementation)���ʹ�ö��߿��Զ����ر仯
 * ���󻯣������ڶ��ʵ���еĹ�ͬ�ĸ�������ϵ�����ǳ��󻯡���Ϊһ�����̣����󻯾��Ǻ���һЩ��Ϣ���Ӷ��Ѳ�ͬ��ʵ�嵱��ͬ����ʵ��Դ��� 
      ʵ�ֻ������󻯸����ľ���ʵ�֣�����ʵ�ֻ��� 
      �����ν��ϣ���������ʵ�����Ϊ��ĳ��ǿ�������������ǵ�ǿ����ȥ����������ϵĽ��ѣ�������
      �����������ָ�����󻯺�ʵ�ֻ�֮�����Ͻ��ѿ�������˵�ǽ�����֮���ǿ�����Ļ�����������
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
		
		//����ά�ȣ�������ǰ������㶫����ֻ��Ҫ����MyDriverManager2
		MyDriverManager2 driverManager2=new MyDriverManager2();
		driverManager2.setDriver(mysqlDriver);
		driverManager2.connect();
	}

}
