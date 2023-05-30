package miniproject;

public abstract class Product {
	String pname;
	int price;
	
	public int getPrice() {
		return price;
	}

	public void printDetail() {
		System.out.print("상품명: " + pname + ", ");
		System.out.print("상품가격: " + price + ", ");
		printExtra();
	}
	
	
	@Override
	public String toString() {
		return pname + "(" + price + ")";
	}
	
	public abstract void printExtra(); 
}
