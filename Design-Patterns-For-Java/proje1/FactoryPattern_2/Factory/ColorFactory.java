package proje2.FactoryPattern_2.Factory;

import proje2.FactoryPattern_2.Color.Black;
import proje2.FactoryPattern_2.Color.Color;
import proje2.FactoryPattern_2.Color.Orange;
import proje2.FactoryPattern_2.Color.Red;
import proje2.FactoryPattern_2.Color.Yellow;
import proje2.FactoryPattern_2.form.Circle;
import proje2.FactoryPattern_2.form.Rectangle;
import proje2.FactoryPattern_2.form.Shape;
import proje2.FactoryPattern_2.form.Square;
import proje2.FactoryPattern_2.form.Triangle;

public class ColorFactory extends AbstractFactory {

	@Override
	
	public Color getColor(String color) {

		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("YELLOW")) {
			return new Yellow();
		} else if (color.equalsIgnoreCase("BLACK")) {
			return new Black();
		} else if (color.equalsIgnoreCase("ORANGE")) {
			return new Orange();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {

		return null;
	}

}
