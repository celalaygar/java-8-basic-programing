package proje3.BuilderPattern.ProductsOfCake;

public class ChocolateCake extends Cake {

	@Override
	public String name() {
		return "ChocolateCake is Product of Cake";
	}

	@Override
	public float price() {
		return 135.0f;
	}

}
