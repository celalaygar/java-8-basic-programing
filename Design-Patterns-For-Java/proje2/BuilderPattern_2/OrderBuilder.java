package proje3.BuilderPattern;

import proje3.BuilderPattern.ProductsOfCake.CheeseCake;
import proje3.BuilderPattern.ProductsOfCake.ChocolateCake;
import proje3.BuilderPattern.ProductsOfCake.WetCake;
import proje3.BuilderPattern.ProductsOfDrink.Coke;
import proje3.BuilderPattern.ProductsOfDrink.Lemonade;
import proje3.BuilderPattern.ProductsOfDrink.Tea;

public class OrderBuilder {
	public Order order_1() {
		Order order = new Order();
		order.addItem(new ChocolateCake());
		order.addItem(new Coke());
		return order;
	}

	public Order order_2() {
		Order order = new Order();
		order.addItem(new CheeseCake());
		order.addItem(new Lemonade());
		return order;
	}

	public Order order_3() {
		Order order = new Order();
		order.addItem(new WetCake());
		order.addItem(new Tea());
		return order;
	}
}
