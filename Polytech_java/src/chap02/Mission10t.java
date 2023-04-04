package chap02;

import java.util.Random;
import java.util.Scanner;

// user와 com이 있다.
// user는 1,2,3 - 가위, 바위, 보
// com 은 random하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라.
// if 또는 switch 중에 결정해서 프로그램 작성

public class Mission10t {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("가위바위보 게임입니다. 가위(1), 바위(2), 보(3) 중에서 입력하세요");
		//1) Math.random() 메소드를 활용해서 난수를 생성
		//		int com =(int)(1+Math.random()*3);
		
		//2) Random() 클래스의 nextInt, nextDouble..
		Random rand = new Random();
		int com = 1+rand.nextInt(3);
		
		int user = scan.nextInt();
		
		if(com == 1) 		System.out.println("컴퓨터 : 가위");
		else if(com == 2) 	System.out.println("컴퓨터 : 바위");
		else 				System.out.println("컴퓨터 : 보");
		
		int result = user-com;
		
		if(result==0)							System.out.println("무승부!");
		else if(result == -1 || result ==2)		System.out.println("컴퓨터 승!");
		else									System.out.println("사용자 승!");
				
		
		}

		
}
