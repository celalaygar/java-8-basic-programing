package proje3.BuilderPattern.ProductsOfDrink;

public class Tea extends Drink {

	@Override
	public String name() {
		return "Tea is Product of Drink";
	}

	@Override
	public float price() {
		return 55.0f;
	}

}
