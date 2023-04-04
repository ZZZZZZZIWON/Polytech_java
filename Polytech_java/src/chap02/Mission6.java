package chap02;

import java.util.Scanner;

public class Mission6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키 입력 >>");
		int height = scan.nextInt();
		System.out.print("나이 입력 >>");
		int age = scan.nextInt();
		
		//조건식으로 계산 (논리연산자 활용)
		if(height>=140 && age>=10)
		{System.out.println("타도 좋아요!");}
		else
		{System.out.println("못 타요!");}
	
		scan.close();
	}
}
