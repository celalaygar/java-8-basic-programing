package proje1.FactoryPattern_1;

import proje1.FactoryPattern_1.form.Circle;
import proje1.FactoryPattern_1.form.Rectangle;
import proje1.FactoryPattern_1.form.Shape;
import proje1.FactoryPattern_1.form.Square;
import proje1.FactoryPattern_1.form.Triangle;

public class ShapeFactory  {

	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();

		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}

		return null;
	}
}
