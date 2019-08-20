package proje4.PrototypePattern.form;

public class Ellipse extends Shape {

	public Ellipse() {
		type = "Ellipse Class";
		setId("5");
	}

	@Override
	void draw() {
		System.out.println("drawing Ellipse as orange color");

	}

}
