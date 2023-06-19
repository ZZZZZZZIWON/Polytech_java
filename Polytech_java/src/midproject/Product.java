package midproject;

public class Product {
	int prcode;
	String prname;
	int price;
	String manufacture;
	
	public Product() {}

	public Product(int prcode, String prname, int price, String manufacture) {
		super();
		this.prcode = prcode;
		this.prname = prname;
		this.price = price;
		this.manufacture = manufacture;
	}

	public int getPrcode() {
		return prcode;
	}

	public void setPrcode(int prcode) {
		this.prcode = prcode;
	}

	public String getPrname() {
		return prname;
	}

	public void setPrname(String prname) {
		this.prname = prname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	@Override
	public String toString() {
		return "Product [prcode=" + prcode + ", prname=" + prname + ", price=" + price + ", manufacture=" + manufacture
				+ "]";
	}
	
	
}
