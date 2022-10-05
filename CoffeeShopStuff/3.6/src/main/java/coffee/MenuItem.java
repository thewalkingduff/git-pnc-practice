package coffee;

public class MenuItem {

	private String item;
	private String type;
	private double price;


	public MenuItem(String item, String type, double price) {
		if (item == null || item.isBlank()) {
			throw new IllegalArgumentException("Item cannot be null or blank.");
		}
		if (price < 0) {
			throw new IllegalArgumentException("Item cannot be less than 0.");
		}
		if (type == null || type.isBlank() ) {
			throw new IllegalArgumentException("Type must be a drink or food.");
		}
		
		this.item = item;
		this.type = type;
		this.price = price;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		if (item == null || item.isBlank()) {
			throw new IllegalArgumentException("Item cannot be null or blank.");
		}
		this.item = item;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		if (type == null || type.isBlank() ) {
			throw new IllegalArgumentException("Type must be a drink or food.");
		}
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Item cannot be less than 0.");
		}
		this.price = price;
	}

}
