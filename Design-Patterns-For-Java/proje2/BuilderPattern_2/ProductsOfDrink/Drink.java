package proje3.BuilderPattern.ProductsOfDrink;

import proje3.BuilderPattern.Items.Bottle;
import proje3.BuilderPattern.Items.Packing;
import proje3.BuilderPattern.Items.Product;

public abstract class Drink implements Product {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
