package miniproject_db;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {

	// ���θ� ���α׷��� ���� �ʵ�

	// 1. ��ϵ� ����� ���� �迭
	User[] users = new User[2];

	// 2. ��ϵ� ��ǰ ���� �迭
	Product[] products = new Product[4];
	// �迭�� ���� ũ��� �Ǿ��־ ���� ����� �ƴ� -> Collections�� ����ϴ� ���� ����

	// 3. ��ǰ ������ �߰��� �� �ִ� ��ٱ���
	ArrayList<Product> cart = new ArrayList<Product>();

	/*
	 * to_do : �߰������� �ʿ��� �ʵ� ================================
	 */
	String title;
	Scanner scan = new Scanner(System.in);

	int sel_user;
	int sum = 0;
	
	/*
	 * setTitle : ���θ��� ���� �ޱ� ================================
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * genUser : ����� ���� ��� =================================
	 */
	@Override
	public void genUser() {
		User user = new User("ȫ�浿", PayType.CARD);
		users[0] = user;

		user = new User("������", PayType.CASH);
		users[1] = user;

	}

	/*
	 * genProduct : ��ǰ ���� ��� ==================================
	 */
	@Override
	public void genProduct() {
		CellPhone cell = new CellPhone("�Ｚ ������S23", 1500000, "SKT");
		products[0] = cell;

		cell = new CellPhone("���� ������14", 1000000, "KT");
		products[1] = cell;

		SmartTV tv = new SmartTV("�Ｚ 3DSmartTV", 3000000, "4K");
		products[2] = tv;

		tv = new SmartTV("LG SmartTV", 2000000, "FullHD");
		products[3] = tv;
	}

	/*
	 * productList : ���θ��� ��ü ����� ���� �ó����� ==================================
	 */
	public void productList() {
		System.out.println(title + ": ��ǰ ��� - ��ǰ ���� >>");
		System.out.println("======================================");

		int index = 0;
		for (Product p : products) {
			System.out.print("[" + index++ + "] ");
			p.printDetail();
		}
		System.out.println("=".repeat(30));
		System.out.println("[h] ����ȭ�� "); // start �޼ҵ�
		System.out.println("[c] üũ�ƿ� "); // checkOut �޼ҵ�
		System.out.println("���� : ");

		String select = scan.next();
		switch (select) {
		case "h":
			start();
			break;

		case "c":
			checkOut();
			break;

		default:
			cart.add(products[Integer.parseInt(select)]);
			productList();
			break;
		}

		// to_do
	}

	/*
	 * start : ���θ��� ����ȭ���� ���� ��� ==================================
	 */
	@Override
	public void start() {
		System.out.println(title + ": ���� ȭ�� - ���� ���� >>");
		System.out.println("======================================");

		int index = 0;
		for (User u : users) {
			System.out.print("[" + index++ + "] ");
			System.out.println(u.toString());
		}
		System.out.println("[x] ���� ");
		System.out.print("���� : ");

		String select = scan.next();
		switch (select) {
		case "x":
			System.exit(0);
			break;

		default:
			sel_user = Integer.parseInt(select);
			productList();
		}
	}

	/* checkOut : üũ�ƿ� �� �����ϱ� ================================== */
	public void checkOut() {

		System.out.println(title + ": üũ�ƿ� >>");
		System.out.println("=".repeat(30));
		
		int index = 0;
		for (Product p : cart) {
			System.out.print("[" + index++ + "] ");
			System.out.println(p.toString());
			System.out.println();
		
			sum += p.getPrice();
		}
		// ���� ��� ���
			// user�� sel_user�� �´� ���� ��� ��������
		System.out.println("=".repeat(30));
		System.out.println("����ڸ�: " + users[sel_user].getName() );
		System.out.println("�������: " + users[sel_user].getPayType() );
		System.out.println("=".repeat(30));
		System.out.println("�հ�: " + sum );
		System.out.println("[p] ���� / [q] ���� �Ϸ�");
		System.out.print("����: ");
		
		String select = scan.next();
		switch (select) {
		case "p": productList(); break;

		case "q": System.out.println("���� �Ϸ�"); 
					System.exit(0); break;
		default:
			checkOut();
		}
	}
	
	public void run() {
		// �ʱ�ȭ & ���۹�ư
		setTitle("E���θ�");
		genUser();
		genProduct();

		start();
	}
	 
	public static void main(String[] args) {
		MyShop myshop = new MyShop();
		myshop.run();
	}
}
