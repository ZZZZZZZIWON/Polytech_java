package chap02;

import java.util.Scanner;

// switch �� Ȱ��
// ����ڷκ��� month�� ������ �Է¹޾Ƽ�
// month�� days�� ������ּ���.
// month : 2 - 28�� / 4,6,9,11 - 30�� / ��Ÿ -31��

public class Mission9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("month�� �Է��ϼ���.>>");
		int month = scan.nextInt();
		int days = 0;

		switch (month) {
		case 2:
			days = 28;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		System.out.println(month + "���� " + days + "���Դϴ�.");

	}

}
