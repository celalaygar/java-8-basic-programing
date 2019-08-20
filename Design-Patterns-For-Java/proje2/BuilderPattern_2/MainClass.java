package proje3.BuilderPattern;

public class MainClass {

	public static void main(String[] args) {
		OrderBuilder orderbulilder=new OrderBuilder();
		
		Order order1=orderbulilder.order_1();
		order1.showItems();
		System.out.println();
		order1=orderbulilder.order_2();
		order1.showItems();
		System.out.println();
		order1=orderbulilder.order_3();
		order1.showItems();
		
		// output : 
		/*
		Product : ChocolateCake is Product of Cake, Packing : Packing Plate, Price : 135.0
		Product : Coke is Product of Drink, Packing : Packing Bottle, Price : 65.0
		
		Product : CheeseCake is Product of Cake, Packing : Packing Plate, Price : 125.0
		Product : Lemonade is Product of Drink, Packing : Packing Bottle, Price : 75.0
		
		Product : WetCake is Product of Cake, Packing : Packing Plate, Price : 115.0
		Product : Tea is Product of Drink, Packing : Packing Bottle, Price : 55.0
				
		*/
	
	}

}
