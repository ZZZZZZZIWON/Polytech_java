package miniproject;

public abstract class Product {
	String pname;
	int price;
	
	public int getPrice() {
		return price;
	}

	public void printDetail() {
		System.out.print("��ǰ��: " + pname + ", ");
		System.out.print("��ǰ����: " + price + ", ");
		printExtra();
	}
	
	
	@Override
	public String toString() {
		return pname + "(" + price + ")";
	}
	
	public abstract void printExtra(); 
}
