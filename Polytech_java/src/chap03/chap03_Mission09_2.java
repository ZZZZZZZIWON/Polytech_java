package chap03;

import java.util.Scanner;

public class chap03_Mission09_2 {
	public static void main(String[] args) {

		int sum = 0, count = 0, n = 0;
		double avg = 0.0;

		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���>>");
		n = scan.nextInt();

		while (n != -1) {
			sum += n;
			count++;
			n = scan.nextInt();
		}

		if (count > 0) {
			System.out.println("���� : " + count);
			avg = (double) sum / count;
			System.out.println("��� : " + avg);
		} else
			System.out.println("������ ������ 0�̶� ����� ���� ���� �����ϴ�.");
	}
}
