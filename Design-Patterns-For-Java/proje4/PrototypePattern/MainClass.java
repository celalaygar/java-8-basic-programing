package proje4.PrototypePattern;

import proje4.PrototypePattern.form.Shape;

public class MainClass {

	public static void main(String[] args) {
	      ShapeCache.loadCache();

	      Shape clone1 = (Shape) ShapeCache.getShape("1");	
	      System.out.println(clone1.getId()+" : "+clone1.getType());
	      Shape clone2 = (Shape) ShapeCache.getShape("2");	
	      System.out.println(clone2.getId()+" : "+clone2.getType());
	      Shape clone3 = (Shape) ShapeCache.getShape("3");
	      System.out.println(clone3.getId()+" : "+clone3.getType());
	      Shape clone4 = (Shape) ShapeCache.getShape("4");
	      System.out.println(clone4.getId()+" : "+clone4.getType());
	      Shape clone5 = (Shape) ShapeCache.getShape("5");
	      System.out.println(clone5.getId()+" : "+clone5.getType());
	      
	      // output : 
	      /*
   			1 : Rectangle Class
			2 : Square Class
			3 : Circle Class
			4 : Triangle Class
			5 : Ellipse Class	       
	       */
	
	}

}
