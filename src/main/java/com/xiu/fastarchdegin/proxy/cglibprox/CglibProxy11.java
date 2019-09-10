package com.xiu.fastarchdegin.proxy.cglibprox;


import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy11 implements MethodInterceptor{
	
	private Object target;
	
	public Object getInstance(final Object target) {
		
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		
		System.out.println("买房前准备");
		Object result = methodProxy.invokeSuper(object, args);
		System.out.println("买房后装修");
		return result;
	}
	
	

}
