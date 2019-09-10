package com.xiu.fastarchdegin.factory.factory2;

public class Test {

	public static void main(String[] args) {
		
		IFactory circlefactory = new CircleFactory();
        Shape circle = circlefactory.getShape();
        circle.draw();
	}
}