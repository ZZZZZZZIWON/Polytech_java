package chap02;

import java.util.Scanner;

public class Mission3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("��ȭ �Է� (���� ��) >>");

		int won = scan.nextInt();

		System.out.println(won + "���� $" + (double)won / 1000 + "$ �Դϴ�.");

		scan.close();

	}
}
