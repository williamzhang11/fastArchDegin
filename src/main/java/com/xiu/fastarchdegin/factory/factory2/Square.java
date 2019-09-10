package com.xiu.fastarchdegin.factory.factory2;
//具体产品角色
public class Square implements Shape{
	
	public Square() {
		System.out.println("Square construct");
	}

	public void draw() {
		System.out.println("Square");
	}
	
	

}
