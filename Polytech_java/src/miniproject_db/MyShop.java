package miniproject_db;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {

	// 쇼핑몰 프로그램을 위한 필드

	// 1. 등록된 사용자 정보 배열
	User[] users = new User[2];

	// 2. 등록된 상품 정보 배열
	Product[] products = new Product[4];
	// 배열은 고정 크기로 되어있어서 좋은 방법은 아님 -> Collections를 사용하는 것이 좋음

	// 3. 상품 정보를 추가할 수 있는 장바구니
	ArrayList<Product> cart = new ArrayList<Product>();

	/*
	 * to_do : 추가적으로 필요할 필드 ================================
	 */
	String title;
	Scanner scan = new Scanner(System.in);

	int sel_user;
	int sum = 0;
	
	/*
	 * setTitle : 쇼핑몰의 제목 달기 ================================
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * genUser : 사용자 정보 등록 =================================
	 */
	@Override
	public void genUser() {
		User user = new User("홍길동", PayType.CARD);
		users[0] = user;

		user = new User("박지원", PayType.CASH);
		users[1] = user;

	}

	/*
	 * genProduct : 상품 정보 등록 ==================================
	 */
	@Override
	public void genProduct() {
		CellPhone cell = new CellPhone("삼성 갤럭시S23", 1500000, "SKT");
		products[0] = cell;

		cell = new CellPhone("애플 아이폰14", 1000000, "KT");
		products[1] = cell;

		SmartTV tv = new SmartTV("삼성 3DSmartTV", 3000000, "4K");
		products[2] = tv;

		tv = new SmartTV("LG SmartTV", 2000000, "FullHD");
		products[3] = tv;
	}

	/*
	 * productList : 쇼핑몰의 전체 기능을 위한 시나리오 ==================================
	 */
	public void productList() {
		System.out.println(title + ": 상품 목록 - 상품 선택 >>");
		System.out.println("======================================");

		int index = 0;
		for (Product p : products) {
			System.out.print("[" + index++ + "] ");
			p.printDetail();
		}
		System.out.println("=".repeat(30));
		System.out.println("[h] 메인화면 "); // start 메소드
		System.out.println("[c] 체크아웃 "); // checkOut 메소드
		System.out.println("선택 : ");

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
	 * start : 쇼핑몰의 메인화면을 위한 기능 ==================================
	 */
	@Override
	public void start() {
		System.out.println(title + ": 메인 화면 - 계정 선택 >>");
		System.out.println("======================================");

		int index = 0;
		for (User u : users) {
			System.out.print("[" + index++ + "] ");
			System.out.println(u.toString());
		}
		System.out.println("[x] 종료 ");
		System.out.print("선택 : ");

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

	/* checkOut : 체크아웃 후 결제하기 ================================== */
	public void checkOut() {

		System.out.println(title + ": 체크아웃 >>");
		System.out.println("=".repeat(30));
		
		int index = 0;
		for (Product p : cart) {
			System.out.print("[" + index++ + "] ");
			System.out.println(p.toString());
			System.out.println();
		
			sum += p.getPrice();
		}
		// 결제 방법 출력
			// user의 sel_user에 맞는 결제 방법 가져오기
		System.out.println("=".repeat(30));
		System.out.println("사용자명: " + users[sel_user].getName() );
		System.out.println("결제방법: " + users[sel_user].getPayType() );
		System.out.println("=".repeat(30));
		System.out.println("합계: " + sum );
		System.out.println("[p] 이전 / [q] 결제 완료");
		System.out.print("선택: ");
		
		String select = scan.next();
		switch (select) {
		case "p": productList(); break;

		case "q": System.out.println("결제 완료"); 
					System.exit(0); break;
		default:
			checkOut();
		}
	}
	
	public void run() {
		// 초기화 & 시작버튼
		setTitle("E쇼핑몰");
		genUser();
		genProduct();

		start();
	}
	 
	public static void main(String[] args) {
		MyShop myshop = new MyShop();
		myshop.run();
	}
}
