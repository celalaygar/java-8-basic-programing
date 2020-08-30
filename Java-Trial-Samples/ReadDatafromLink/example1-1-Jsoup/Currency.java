package getdatafromURL.example1;

public class Currency {
	private String type;
	private Double buyying;
	private Double selling;
	public Currency(String type, Double buyying, Double selling) {
		super();
		this.type = type;
		this.buyying = buyying;
		this.selling = selling;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
		return "Currency [type=" + type + ", buyying=" + buyying + ", selling=" + selling + "]";
	}
	
	
	
}
