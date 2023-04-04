package chap03;

import java.util.Random;
import java.util.Scanner;

// user와 com이 있다.
// user는 1,2,3 - 가위, 바위, 보
// com 은 random하게 컴퓨터가 생성한다.
// 1회의 게임을 하고 누가 이겼는지 화면에 출력하라.
// if 또는 switch 중에 결정해서 프로그램 작성

public class Mission2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1) Math.random() 메소드를 활용해서 난수를 생성
		//		int com =(int)(1+Math.random()*3);
		
		//2) Random() 클래스의 nextInt, nextDouble..
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		
		int count = 0;
		final int TRY_NUMBER = 10; //상수
		boolean state = true; //상태가 성공임을 가정(건드리지 않는 한 계속 true)
		
		
		while(true) {
			count++; 
			if(count >TRY_NUMBER) {
				state = false; 
				break; //break는 if조건문에 대한 실행문(when if문 다음에 반복문)
			}
			
			int com = 1+rand.nextInt(3);
			
			System.out.print("가위(1), 바위(2), 보(3) >>");
			int user = scan.nextInt();
			
			if(com == 1) 		System.out.println("컴퓨터 : 가위");
			else if(com == 2) 	System.out.println("컴퓨터 : 바위");
			else 				System.out.println("컴퓨터 : 보");
			
			int result = user-com;
			
			if(result==0)							System.out.println("무승부!");
			else if(result == -1 || result ==2)		System.out.println("컴퓨터 승!");
			else {									
				System.out.println("사용자 승!");
				break; // 사용자가 승리하면 프로그램 종료
			}
		}
		System.out.println("================");
		if(state) System.out.println("당신의 승리!");
		else  	  System.err.println("시도횟수 초과!");
		
		scan.close();
	}
		
}
