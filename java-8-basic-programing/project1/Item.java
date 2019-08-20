package Java8.project1;

import java.math.BigDecimal;

public class Item {
    private String name;
    private int qty;
    private BigDecimal price;
    
	public Item(String name2, int qty2, BigDecimal a) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = a;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
