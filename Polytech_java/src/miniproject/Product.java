package miniproject;

public abstract class Product {
	 String pname;
	 int price;
	
	public void printDetail() {
		System.out.print("��ǰ��: " + pname + ", ");
		System.out.print("��ǰ����: " + price + ", ");
		printExtra();
	}
	public abstract void printExtra(); 
}
