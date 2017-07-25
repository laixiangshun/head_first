package com.java.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * ������ģʽ
 * ������ģʽ���ܶ๦�ܼ��ɵ�һ������������Դ�����Ƚϸ��ӵĶ���
 * �빤��ģʽ��������ǣ�����ģʽ��ע���Ǵ���������Ʒ����������ģʽ���ע�������϶��󣬶������
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
	//���Է���
	public void print(List<Sender> list){
		for (int i = 0; i < list.size(); i++) {
			list.get(i).send();
		}
	}
}
