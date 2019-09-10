package com.xiu.fastarchdegin.factory.factory2;
//具体产品角色
public class Rectangle implements Shape{

	public Rectangle() {
		System.out.println("Rectangle construct");
	}

	public void draw() {
		System.out.println("Rectangle");
	}
	
	
}
