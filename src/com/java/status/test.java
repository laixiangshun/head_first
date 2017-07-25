package com.java.status;

/**
 * 状态模式
 * 对象的状态改变时，同时改变其行为
 * 通过改变状态来获得不同的行为；同时对外显示你的状态
 * 状态模式在日常开发中用的挺多的，尤其是做网站的时候，我们有时希望根据对象的某一属性，区别开他们的一些功能，比如说简单的权限控制等
 * @author lailai
 *
 */
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State state=new State();
		Context context=new Context(state);
		state.setValue("state1");
		context.method();
		state.setValue("state2");
		context.method();
	}

}
