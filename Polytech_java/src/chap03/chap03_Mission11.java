package chap03;

import java.util.Scanner;

public class chap03_Mission11 {
	public static void main(String[] args) {
		int lotto_num[] = new int [7];
		//String names[] = {"엄남경", "박지원", "이유진"};
		
		//배열에 값 입력
		for(int i = 0; i < 7; i++) {
			lotto_num[i] =1 + (int)(Math.random()*45); //i번째 값 생성
			
			for(int j = 0; j <i; j++) //j는 기존에 있던 값, i는 미래에 생성할 값
				if(lotto_num[i] == lotto_num[j]) 
					i--;
			
		}
		//배열에 값 출력
//		for(int i = 0; i < 7; i++) 
//			System.out.printf("%5d", lotto_num[i]);
			
		//for-each문을 이용한 값 출력
		for(int num : lotto_num)
			System.out.printf("%5d", num);
			System.out.println();
//		for(String name : names)
//			System.out.print(name+" ");
	}
}

