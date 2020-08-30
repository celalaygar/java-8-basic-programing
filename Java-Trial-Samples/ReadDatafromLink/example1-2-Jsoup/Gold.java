package getdatafromURL.example3;

public class Gold {
	private String name;
	private Double buyying;
	private Double selling;
	public Gold(String name, Double buyying, Double selling) {
		super();
		this.name = name;
		this.buyying = buyying;
		this.selling = selling;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Double getBuyying() {
		return buyying;
	}
	public void setBuyying(Double buyying) {
		this.buyying = buyying;
	}
	public Double getSelling() {
		return selling;
	}
	public void setSelling(Double selling) {
		this.selling = selling;
	}

	@Override
	public String toString() {
		return "Gold [name=" + name + ", buyying=" + buyying + ", selling=" + selling  + "]";
	}
}
