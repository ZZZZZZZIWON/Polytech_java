package chap03;

import java.util.Scanner;

public class chap03_Mission09_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>>");
		int sum = 0, count = 0, n = 0;
		double avg = 0.0;

		do {
			sum += n;
			count++;
			n = scan.nextInt();
		}

		while (n != -1);

		
		if (count > 0) {
			System.out.println("갯수 : " + count);
			avg = (double) sum / count;
			System.out.printf("평균 : " + avg);
		} else
			System.out.println("정수의 갯수가 0이라서 평균을 구할 수가 없습니다.");
	}
}
