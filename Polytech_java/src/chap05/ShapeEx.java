package chap05;

class Shape {
	void draw() {
		System.out.println("Shape");
	} 
}

class Line extends Shape {
	@Override
	void draw() {
		System.out.println("line");
	}
}

class Rect extends Shape {
	@Override
	void draw() {
		System.out.println("rect");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("circle");
	}
}

public class ShapeEx {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw(); //circle
		// if overriding을 안 했다면 super class의 메소드 실행
		System.out.println("--------------");
		Shape shape = new Line(); 
		shape.draw(); // super class의 메소드 무시하기 + 덮어쓰기
	}
}
