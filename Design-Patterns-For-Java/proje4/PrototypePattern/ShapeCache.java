package proje4.PrototypePattern;

import java.util.Hashtable;

import proje4.PrototypePattern.form.Circle;
import proje4.PrototypePattern.form.Ellipse;
import proje4.PrototypePattern.form.Rectangle;
import proje4.PrototypePattern.form.Shape;
import proje4.PrototypePattern.form.Square;
import proje4.PrototypePattern.form.Triangle;

public class ShapeCache {
	   private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

	   public static Shape getShape(String shapeId) {
	      Shape cloneShape = shapeMap.get(shapeId);
	      return ((Shape) cloneShape.clone());
	   }

	   public static void loadCache() {
	      Circle circle = new Circle();
	      shapeMap.put(circle.getId(),circle);
	      Triangle triangle = new Triangle();
	      shapeMap.put(triangle.getId(), triangle); 
	      
	      Square square = new Square();
	      shapeMap.put(square.getId(),square);
	      
	      Ellipse ellipse = new Ellipse();
	      shapeMap.put(ellipse.getId(), ellipse);

	      Rectangle rectangle = new Rectangle();
	      shapeMap.put(rectangle.getId(), rectangle);

	   }
}
