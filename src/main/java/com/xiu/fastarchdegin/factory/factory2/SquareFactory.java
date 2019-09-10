package com.xiu.fastarchdegin.factory.factory2;

public class SquareFactory implements IFactory{

	public Shape getShape() {
		
		return new Square();
		
	}

	
}
