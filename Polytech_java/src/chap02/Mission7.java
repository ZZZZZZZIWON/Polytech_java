package chap02;

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("나이 입력 >>");
		int age = scan.nextInt();
		System.out.print("시간 입력 >>");
		int time = scan.nextInt();
		
		int price = 0;

		if (time>=9 && time <=18) //주간권
		{
			if(age<=7 || age>=65) price = 15000;
			else 				price = 30000;
			System.out.println("요금은 "+price+"입니다.");
		}		
		else if(time>18 && time<=22) //야간권
		{
			if(age<=7 || age>=65) price = 10000;
			else 				price = 20000;
			System.out.println("요금은 "+price+"입니다.");
		}
		else
			System.out.println("운행시간이 아닙니다.");			
		
		scan.close();
	}
}
