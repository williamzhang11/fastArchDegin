package com.xiu.fastarchdegin.factory.factory1;
//如果需要改善的话可以通过 反射+配置文件 的形式来改善，这种方式使用的也是比较多的
public class FactoryTest2 {
	public static void main(String[] args) {

		Circle circle = (Circle) ShapeFactory1.getClass(Circle.class);
		circle.draw();
		
		Rectangle rectangle = (Rectangle) ShapeFactory1.getClass(Rectangle.class);
		rectangle.draw();
		
		Square square = (Square) ShapeFactory1.getClass(Square.class);
		square.draw();

	}

}
