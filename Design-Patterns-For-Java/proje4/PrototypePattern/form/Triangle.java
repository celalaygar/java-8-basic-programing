package proje4.PrototypePattern.form;

public class Triangle extends Shape {

	public Triangle() {
		type = "Triangle Class";
		setId("4");
	}

	@Override
	void draw() {
		System.out.println("drawing Triangle as black color");

	}

}
