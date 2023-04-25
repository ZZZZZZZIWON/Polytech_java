package chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Page386_4 {

	public static void main(String[] args) {

//		(1) - StringTokenizer
//		 Scanner scan = new Scanner(System.in);
//		 System.out.print(">>");
//		 String sentence = scan.nextLine();
//
//		 StringTokenizer st = new StringTokenizer(sentence, " ");
//		 System.out.println("���� ���� : " + st.countTokens());

//		(2) - split method ���
		Scanner scan = new Scanner(System.in);

		// 2-1) s.length�� �ϴ� ���
		while (true) {
			System.out.print(">>");
			String sentence = scan.nextLine();

			if (sentence.equals("�׸�")) {
				break;
			} 
				String s[] = sentence.split(" ");
				System.out.println("���� ���� : " + s.length);	
		}

		// 2-2) count������ Ƚ�� ���� ���� ���
		while (true) {
			System.out.print(">>");
			String sentence = scan.nextLine();

			if (sentence.equals("�׸�")) {
				break;
			}
			String s[] = sentence.split(" ");
			int count = 0;
			for (String n : s) {
				count++;
			}
			System.out.println("���� ���� : " + count);

		}
		System.out.println("�����մϴ�.");

		// 2-P_split) 
		while (true) {
			System.out.println(">>");
			String msg = scan.nextLine();
			
			if (msg.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String s[] = msg.split(" ");
			System.out.println("���� ���� : " + s.length);
		}
		
		// 2-P_StringTockenizer)
		StringTokenizer st; // StringTokenizer
		while (true) {
			int count = 0; 
			System.out.println(">>"); // ���ڸ� �Է��� ������ count ������ �ʱ�ȭ
			String msg = scan.nextLine();
			
			if (msg.equals("�׸�")) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			st = new StringTokenizer(msg, " ");
			while(st.hasMoreTokens()) {
				st.nextToken();
				count++;
			}
			System.out.println("���� ���� : " + count);
		}
		
	}

}
