package chap03;

import java.util.Scanner;

public class chap03_Mission09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요>>");
		int num = scan.nextInt();
		
		int count =0;
		int sum = 0;
		double avg = 0.0;
		if(num!=0) {
			num = scan.nextInt();
			count++;
		System.out.println(count);
		sum = sum+num;
		avg = sum/count;}
		
		System.out.printf("sum = %d\n",sum);
		System.out.printf("avg = %d",avg);
		
		
		
		
	}
}

