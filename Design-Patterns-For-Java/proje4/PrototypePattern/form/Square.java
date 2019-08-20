package proje4.PrototypePattern.form;

public class Square extends Shape {

	public Square() {
		type = "Square Class";
		setId("2");
	}

	@Override
	void draw() {
		System.out.println("drawing Square as yellow color");

	}

}
