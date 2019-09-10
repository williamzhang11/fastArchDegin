package com.xiu.fastarchdegin.factory.factory2;

public class CircleFactory implements  IFactory{

	public Shape getShape() {
		
		
		 return new Circle();
	}
	
	

}
