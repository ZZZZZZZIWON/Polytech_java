package chap07;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();

		dic.put("apple", "���");
		dic.put("grape", "����");
		dic.put("peach", "������");
		dic.put("mango", "����");
		dic.put("orange", "������");

//		System.out.println(dic.get("apple"));

		while (true) {

			System.out.println("�O����� �ܾ� >> ");
			String key = scan.next();
			if (key.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			System.out.println(dic.get(key));
			
		}
	}

}
