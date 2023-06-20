package midprojectP;

public class Product {
	int pcode; 		//��ǰ�ڵ�
	String pname;		//��ǰ��
	int price;			//����
	String manufacture;	//������
	
	//������
	public Product() {}
	public Product(int pcode, String pname, int price, String manufacture) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
		this.manufacture = manufacture;
	}
	//getters & setters
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
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
		return "Product [pcode=" + pcode + ", prname=" + pname + ", price=" + price + ", manufacture=" + manufacture
				+ "]";
	}
}
