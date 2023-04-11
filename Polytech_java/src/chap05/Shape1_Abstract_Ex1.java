package chap05;

abstract class Shape1 {
	 abstract void draw(); // 반드시 overriding 되어야 함
	 void paint() {System.out.println("paint메소드 호출");};
	 void print(){System.out.println("print메소드 호출");};
}

class RealShape extends Shape1 {
	void draw() {System.out.println("draw메소드 호출");}
}

public class Shape1_Abstract_Ex1 {
	public static void main(String[] args) {
		Shape1 shape1 = new RealShape();
		shape1.paint();
		shape1.draw();
	}
}
