package chap02;

import java.util.Scanner;

public class Mission4_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("���� �Է�(10~99) >>");

		int ���� = scan.nextInt();
		int �����ڸ� = ���� / 10;
		int �����ڸ� = ���� % 10;

	//	String msg = (�����ڸ� == �����ڸ�) ?  "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�."
	//									: "NO! ���� �ʽ��ϴ�.";
	//	System.out.println(msg);
		
		String msg;
		if (�����ڸ� == �����ڸ�) {msg = "YES! ���� �ڸ��� ���� �ڸ��� �����ϴ�.";}
		else                 {msg = "NO! ���� �ʽ��ϴ�.";}
		
		System.out.println(msg);

		scan.close();
	}
}
