package chap05;


//추상클래스 정의
abstract class Shape2{
 abstract void draw();
}

//추상클래스를 상속받아서 재정의해서 사용
class Circle1 extends Shape2 {

 @Override
 void draw() {
     System.out.println("원 그리기");
 }
}
class Line1 extends Shape2 {

 @Override
 void draw() {
     System.out.println("라인 그리기");
 }
}

class Rect1 extends Shape2 {

 @Override
 void draw() {
     System.out.println("사각형 그리기");
 }
}

public class ShapeEx01 {
 public static void main(String[] args) {
     Shape2 s = new Circle1(); // Upcasting 후_Sub class를 이용해서 객체 생성 후 메소드 실행
     s.draw();

 }
}
