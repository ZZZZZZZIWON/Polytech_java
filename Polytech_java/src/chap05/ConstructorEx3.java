package chap05;

class A {
	public A() { System.out.println("기본생성자A"); }
	public A(int x) { System.out.println(x + " : 정수값생성자A"); }
}

class B extends A {
	
	public B() { 
		super(100);
		System.out.println("기본생성자B"); }
	public B(int x) { System.out.println(x + " : 정수값생성자B"); }

}

public class ConstructorEx3 {

	public static void main(String[] args) {
		B b = new B(); // 생성자B 호출 -> 생성자A 호출 -> 생성자A 실행 -> 생성자B 실행
		
	}

}
