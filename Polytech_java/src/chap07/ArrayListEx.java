package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		// ���ڿ��� ���԰����� ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();

		// Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� ����
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("�̸��� �Է��ϼ���>> ");
			a.add(scan.next()); // ����ڿ��� ���� �̸��� �ٷ� add�� ����(�߰� ������ ��ĥ �ʿ� X)
		}

		// ArrayList�� ����ִ� ��� �̸� ���
		for (String name : a) {
			System.out.print(name);
		}

		// ���� �� �̸� ����ϱ�(data�� ã�� ���� index�� �����ϱ�)
		int longestIndex = 0;
		for (int i = 1; i < a.size(); i++) {
			if(a.get(i).length() > a.get(longestIndex).length())
				// get�ϸ� ������ String(name)���� ������ �� ���� length(���ڿ��� ����)�� ��
				longestIndex = i;
			
			System.out.println("���� �� �̸� : " + a.get(longestIndex));
		}
	}

}
