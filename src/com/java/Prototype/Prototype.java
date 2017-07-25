package com.java.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ
 * ��ģʽ��˼����ǽ�һ��������Ϊԭ�ͣ�������и��ơ���¡������һ����ԭ�������Ƶ��¶���
 * һ��ԭ���ֻ࣬��Ҫʵ��Cloneable�ӿڣ���дclone�������˴�clone�������Ըĳ���������ƣ�
 * ��ΪCloneable�ӿ��Ǹ��սӿڣ���������ⶨ��ʵ����ķ���������cloneA����cloneB��
 * ��Ϊ�˴����ص���super.clone()��仰��super.clone()���õ���Object��clone()������
 * ����Object���У�clone()��native�ģ�������ôʵ�֣��һ�����һƪ�����У����ڽ��Java�б��ط����ĵ��ã��˴��������
 * ��������ҽ���϶����ǳ���ƺ������˵һ�£�������Ҫ�˽�����ǳ���Ƶĸ��

    ǳ���ƣ���һ�������ƺ󣬻����������͵ı����������´��������������ͣ�ָ��Ļ���ԭ������ָ��ġ�

    ��ƣ���һ�������ƺ󣬲����ǻ����������ͻ����������ͣ��������´����ġ�����˵��������ƽ�������ȫ���׵ĸ��ƣ���ǳ���Ʋ�����
 * @author lailai
 *
 */
public class Prototype implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String string;
	private SerializableObject obj;
	
	//ǳ����
	public Object clone() throws CloneNotSupportedException{
		Prototype prototype=(Prototype)super.clone();
		return prototype;
	}
	//���
	public Object deepClone() throws CloneNotSupportedException,IOException, ClassNotFoundException{
		//����ǰ����д�뵱ǰ����Ķ�������
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(out);
		oos.writeObject(this);
		
		//�����������������µĶ���
		ByteArrayInputStream in=new ByteArrayInputStream(out.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(in);
		return ois.readObject();
	}
	
	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}
	public SerializableObject getObj() {
		return obj;
	}
	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub

		//����
		Prototype prototype=new Prototype();
		prototype.setString("123");
		prototype.setObj(prototype.new SerializableObject());
		//ǳ����
		Prototype prototype2=(Prototype)prototype.clone();
		//���
		Prototype prototype3=(Prototype)prototype.deepClone();
		
		System.out.println(prototype2.getString().equals(prototype.getString()));
		System.out.println(prototype2.getString()==prototype.getString());
		System.out.println(prototype2.getObj()==prototype.getObj());
		
		System.out.println(prototype.getString().equals(prototype3.getString()));
		System.out.println(prototype.getString()==prototype3.getString());
		System.out.println(prototype.getObj()==prototype3.getObj());
		
		System.out.println(prototype2.getString().equals(prototype3.getString()));
		System.out.println(prototype2.getString()==prototype3.getString());
		System.out.println(prototype2.getObj()==prototype3.getObj());
	}

	//�ڲ���
	class SerializableObject implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SerializableObject(){}
		
	}
}
