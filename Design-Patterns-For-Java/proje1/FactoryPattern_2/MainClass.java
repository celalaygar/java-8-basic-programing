package proje2.FactoryPattern_2;

import proje2.FactoryPattern_2.Color.Color;
import proje2.FactoryPattern_2.Factory.AbstractFactory;
import proje2.FactoryPattern_2.Factory.Factory;
import proje2.FactoryPattern_2.form.Shape;

public class MainClass {
	public static void main(String[] args) {
		AbstractFactory forShape = Factory.getFactory("SHAPE");

		Shape s1=forShape.getShape("RECTANGLE");
		s1.draw();
		Shape s2=forShape.getShape("TRIANGLE");
		s2.draw();
		Shape s3=forShape.getShape("CIRCLE");
		s3.draw();
		Shape s4=forShape.getShape("SQUARE");
		s4.draw();

		AbstractFactory forColor = Factory.getFactory("COLOR");
		
		Color c1=forColor.getColor("BLACK");
		c1.fill();
		Color c2=forColor.getColor("RED");
		c2.fill();
		Color c3=forColor.getColor("YELLOW");
		c3.fill();
		Color c4=forColor.getColor("ORANGE");
		c4.fill();
		
		// Output : 
		/*
		draw() method for Rectangle Class.
		draw() method for Triangle Class.
		draw() method for Circle Class.
		draw() method for Square Class.
		fill() method Black Class.
		fill() method Red Class.
		fill() method Yellow Class.
		fill() method Orange Class.
		*/
	}

}
