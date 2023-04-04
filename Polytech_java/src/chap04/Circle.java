package chap04;

public class Circle {
	// 필드 : 속성 =========================
	public int radius; // 멤버 변수
	public String name; // 멤버 변수
	public static final double PI = 3.14; // 멤버 변수(상수)
	public static String Circle_name = "원형"; // 클래스 변수

	// 메소드 : 행위 ========================
	// 생성자 메소드
	public Circle() {
	}; // Default 생성자
	public Circle(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}
	// 일반 메소드

	double getArea( ) {return PI * radius * radius;}
			// Static method(위의 메소드를 오버로딩)
	static double getArea(double radius) {return PI * radius * radius;}
	
	// main 메소드
	public static void main(String[] args) {
//		Circle c = new Circle();
//		Circle c1 = new Circle("원1", 3);
//		System.out.printf("%.2f", c1.getArea());
		
		Circle pizza = new Circle("피자", 10);
		Circle donut = new Circle("도넛", 2);
		System.out.println(Circle.Circle_name);
		System.out.println("피자의 크기는 " + pizza.getArea());
		System.out.println("도넛의 크기는 " + donut.getArea());
		System.out.println(Circle.getArea(3.0));
	}
}
