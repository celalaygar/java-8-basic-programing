package proje2.FactoryPattern_2.Factory;

import proje2.FactoryPattern_2.Color.Color;
import proje2.FactoryPattern_2.form.Circle;
import proje2.FactoryPattern_2.form.Rectangle;
import proje2.FactoryPattern_2.form.Shape;
import proje2.FactoryPattern_2.form.Square;
import proje2.FactoryPattern_2.form.Triangle;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		}
		if (shape.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}else if (shape.equalsIgnoreCase("TRIANGLE")) {
			return new Triangle();
		}
		return null;
	}

}
