package com.xiu.fastarchdegin.singleton;

/**
 * 懒汉模式，线程安全
 * 
 * 优点：第一次调用时初始化，避免内存浪费
 * 
 * 缺点：必须加锁synchronized才能保证线程安全，加锁影响效率，大部分情况下是不需要同步的
 * 
 */
public class SingleObject2 {

	private static SingleObject2 singleObject2 = null;
	
	private SingleObject2() {}
	
	private synchronized SingleObject2 getInstance() {
		
		if(singleObject2 == null) {
			singleObject2 = new SingleObject2();
		}
		
		return singleObject2;
	}
	
	public void showMsg() {
		System.out.println("2222");
	}
	
	
}
