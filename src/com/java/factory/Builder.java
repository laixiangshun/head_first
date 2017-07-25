package com.java.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * 建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西
 * 与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建复合对象，多个部分
 * @author lailai
 *
 */
public class Builder {

	private List<Sender> list=new ArrayList<>();
	
	public List<Sender> getList() {
		return list;
	}
	public void produceMailSender(int count){
		for(int i=0;i<count;i++){
			list.add(new MailSender());
		}
	}
	public void produceSmsSender(int count){
		for(int i=0;i<count;i++){
			list.add(new SmsSender());
		}
	}
	//测试方法
	public void print(List<Sender> list){
		for (int i = 0; i < list.size(); i++) {
			list.get(i).send();
		}
	}
}
