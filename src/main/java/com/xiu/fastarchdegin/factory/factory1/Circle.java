package com.xiu.fastarchdegin.factory.factory1;
//具体产品角色
public class Circle implements Shape{

	public Circle() {
		System.out.println("Circle construct");
	}
	public void draw() {
		System.out.println("circle");
	}

	
}
