package chap02;

import java.util.Scanner;

public class Mission4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է�(10~99) >>");

		int num = scan.nextInt();
		int a = num/10;
		int b = num&10;		
		
		if(a==b) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		
		scan.close();

	}
}
