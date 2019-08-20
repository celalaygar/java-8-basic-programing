package proje4.PrototypePattern.form;

public class Circle extends Shape {

	public Circle() {
		type = "Circle Class";
		setId("3");
	}

	@Override
	void draw() {
		System.out.println("drawing Circle as red color");

	}

}
