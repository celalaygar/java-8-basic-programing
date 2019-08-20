package Java8.project2;

import java.math.BigDecimal;

public class Developer {
	String name;
	BigDecimal price;
	
	int age;

	public Developer(String name, BigDecimal price, int age) {
		super();
		this.name = name;
		this.price = price;
		this.age = age;
	}
	public Developer() {
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
