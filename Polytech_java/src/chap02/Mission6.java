package chap02;

import java.util.Scanner;

public class Mission6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ű �Է� >>");
		int height = scan.nextInt();
		System.out.print("���� �Է� >>");
		int age = scan.nextInt();
		
		//���ǽ����� ��� (�������� Ȱ��)
		if(height>=140 && age>=10)
		{System.out.println("Ÿ�� ���ƿ�!");}
		else
		{System.out.println("�� Ÿ��!");}
	
		scan.close();
	}
}
