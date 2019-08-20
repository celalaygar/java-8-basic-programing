	package proje3.BuilderPattern.ProductsOfCake;

import proje3.BuilderPattern.Items.Packing;
import proje3.BuilderPattern.Items.Plate;
import proje3.BuilderPattern.Items.Product;

public abstract class Cake implements Product {

	@Override
	public abstract String name();

	@Override
	public Packing packing() {
		return new Plate();
	}

	@Override
	public abstract float price();

}
