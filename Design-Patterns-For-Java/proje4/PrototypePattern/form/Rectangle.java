package proje4.PrototypePattern.form;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle Class";
		setId("1");
	}

	@Override
	void draw() {
		System.out.println("drawing Rectangle as blue color");
	}

}
