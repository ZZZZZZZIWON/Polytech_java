package chap03;

import java.util.Scanner;

public class chap03_Mission09_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		int sum = 0, count = 0, n = 0;
		double avg = 0.0;

		do {
			sum += n;
			count++;
			n = scan.nextInt();
		}

		while (n != -1);

		
		if (count > 0) {
			System.out.println("���� : " + count);
			avg = (double) sum / count;
			System.out.printf("��� : " + avg);
		} else
			System.out.println("������ ������ 0�̶� ����� ���� ���� �����ϴ�.");
	}
}
