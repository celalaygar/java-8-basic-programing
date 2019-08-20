package proje3.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

import proje3.BuilderPattern.Items.Product;

public class Order {
	private List<Product> items = new ArrayList<Product>();

	public void addItem(Product item) {
		items.add(item);
	}

	public float getCostOfOrder() {
		float cost = 0.0f;

		for (Product item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {

		for (Product item : items) {
			System.out.print("Product : " + item.name());
			System.out.print(", Packing : " + item.packing().pack());
			System.out.println(", Price : " + item.price());
		}
	}
}
