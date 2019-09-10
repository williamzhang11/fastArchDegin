package com.xiu.fastarchdegin.singleton;

/*
 * 懒汉模式
 * 
 * 双重校验锁
 * 
 * 执行双重检查是因为，如果多个线程同时了通过了第一次检查，并且其中一个线程首先通过了第二次检查并实例化了对象，那么剩余通过了第一次
 * 检查的线程就不会再去实例化对象。
 * 除了初始化的时候会出现加锁的情况，后续的所有调用都会避免加锁而直接返回，解决了性能消耗的问题
 * 
 * 使用了volatile关键字后，重排序被禁止，所有的写（write）操作都将发生在读（read）操作之前
 * 
 * 
 */
public class SingleObject3 {

	
	private static volatile SingleObject3 singleObject3 = null;
	
	private SingleObject3() {}
	
	public SingleObject3 getInstance() {
		
		if(singleObject3 == null) {
			
			synchronized (SingleObject3.class) {
				
				if(singleObject3 ==null) {
					
					singleObject3 = new SingleObject3();
				}
				
			}
			
		}
		
		return singleObject3;
	}
	
}
