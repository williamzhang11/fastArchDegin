package com.xiu.fastarchdegin.factory.factory2;

public class RectangleFactory implements IFactory{
	
	    public Shape getShape() {
	        return new Rectangle();
	    }
	
}
