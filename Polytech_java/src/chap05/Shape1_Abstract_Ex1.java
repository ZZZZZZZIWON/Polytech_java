package chap05;

abstract class Shape1 {
	 abstract void draw(); // �ݵ�� overriding �Ǿ�� ��
	 void paint() {System.out.println("paint�޼ҵ� ȣ��");};
	 void print(){System.out.println("print�޼ҵ� ȣ��");};
}

class RealShape extends Shape1 {
	void draw() {System.out.println("draw�޼ҵ� ȣ��");}
}

public class Shape1_Abstract_Ex1 {
	public static void main(String[] args) {
		Shape1 shape1 = new RealShape();
		shape1.paint();
		shape1.draw();
	}
}
