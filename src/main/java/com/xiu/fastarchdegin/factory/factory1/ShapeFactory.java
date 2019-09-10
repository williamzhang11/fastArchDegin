package com.xiu.fastarchdegin.factory.factory1;

public class ShapeFactory {

	public static Shape getShape(String shapeType) {
		
		if(shapeType==null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
		
	}
}
