package proje3.BuilderPattern.ProductsOfCake;

public class CheeseCake extends Cake {

	@Override
	public String name() {
		return "CheeseCake is Product of Cake";
	}

	@Override
	public float price() {
		return 125.0f;
	}

}
