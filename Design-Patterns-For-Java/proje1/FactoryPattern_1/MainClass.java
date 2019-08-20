package proje1.FactoryPattern_1;

import proje1.FactoryPattern_1.form.Shape;

public class MainClass {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("TRIANGLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		Shape shape4 = shapeFactory.getShape("CIRCLE");
		shape4.draw();
		// Output : 
		/*
		draw() method for Triangle Class.
		draw() method for Rectangle Class.
		draw() method for Square Class.
		draw() method for Circle Class.
		 */
	}

}
