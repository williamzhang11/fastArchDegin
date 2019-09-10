package com.xiu.fastarchdegin.singleton;

//饿汉模式，线程安全，缺点：类加载时初始化，浪费内存


public class SingleObject1 {

	private static SingleObject1 singleObject1 = new SingleObject1();
	
	private SingleObject1() {}
	
	public SingleObject1  getInstance() {
		return singleObject1;
	}
	
	public void showMessage() {
		System.out.println("1111");
	}
}
