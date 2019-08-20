package proje3.BuilderPattern.ProductsOfCake;

public class WetCake extends Cake {

	@Override
	public String name() {
		return "WetCake is Product of Cake";
	}

	@Override
	public float price() {
		return 115.0f;
	}


}
