package chap02;

import java.util.Random;
import java.util.Scanner;

// user와 com이 있다.
// user는 1,2,3 - 가위, 바위, 보
// com 은 random하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라.
// if 또는 switch 중에 결정해서 프로그램 작성

public class Mission10_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("가위바위보 게임입니다. 가위(1), 바위(2), 보(3) 중에서 입력하세요");
		//1) Math.random() 메소드를 활용해서 난수를 생성
		//		int com =(int)(1+Math.random()*3);
		
		//2) Random() 클래스의 nextInt, nextDouble..
		Random rand = new Random();
		int com = 1+rand.nextInt(3);
		int user = scan.nextInt();
		
		if(com >3 || user >3) {
			System.out.println("게임을 할 수 없습니다.");
		}
		else {
			switch(user-com) {
				case 0:
					System.out.println("비겼습니다.");
				break;
				case -1: case 2:
					System.out.println("졌습니다.");
				break;
				case -2: case 1:
					System.out.println("이겼습니다.");
				break;
			}
		}
		
		scan.close();
		
		
	}
}
