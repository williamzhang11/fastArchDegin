package com.xiu.fastarchdegin.factory.factory1;
//如果我们新增产品类的话，就需要修改工厂类中的getShape（）方法，这很明显不符合 开放-封闭原则 。
public class FactoryTest {
	
	public static void main(String[] args) {
		
		// 获取 Circle 的对象，并调用它的 draw 方法
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();

        // 获取 Rectangle 的对象，并调用它的 draw 方法
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // 获取 Square 的对象，并调用它的 draw 方法
        Shape square = ShapeFactory.getShape("SQUARE");
        square.draw();
	}

}
