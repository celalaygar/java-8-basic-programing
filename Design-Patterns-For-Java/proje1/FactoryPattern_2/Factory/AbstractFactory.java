package proje2.FactoryPattern_2.Factory;

import proje2.FactoryPattern_2.Color.Color;
import proje2.FactoryPattern_2.form.Shape;

public abstract class AbstractFactory {
	
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}
