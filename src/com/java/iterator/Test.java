package com.java.iterator;

/**
 * ����ģʽ
 * ������ģʽ����˳����ʾۼ��еĶ���һ����˵�������зǳ�����
 * ��Ҫ�����Ķ��󣬼��ۼ����󣬶��ǵ������������ڶԾۼ�������б�������
 * @author lailai
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> collection=new MyCollection<>();
		collection.add("A");
		collection.add("B");
		collection.add("C");
		collection.add("D");
		collection.add("E");
		collection.add("F");
		Iterator<String> it=collection.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
