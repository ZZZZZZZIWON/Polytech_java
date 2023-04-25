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
//		 System.out.println("어절 개수 : " + st.countTokens());

//		(2) - split method 사용
		Scanner scan = new Scanner(System.in);

		// 2-1) s.length로 하는 방법
		while (true) {
			System.out.print(">>");
			String sentence = scan.nextLine();

			if (sentence.equals("그만")) {
				break;
			} 
				String s[] = sentence.split(" ");
				System.out.println("어절 개수 : " + s.length);	
		}

		// 2-2) count변수애 횟수 저장 설정 방법
		while (true) {
			System.out.print(">>");
			String sentence = scan.nextLine();

			if (sentence.equals("그만")) {
				break;
			}
			String s[] = sentence.split(" ");
			int count = 0;
			for (String n : s) {
				count++;
			}
			System.out.println("어절 개수 : " + count);

		}
		System.out.println("종료합니다.");

		// 2-P_split) 
		while (true) {
			System.out.println(">>");
			String msg = scan.nextLine();
			
			if (msg.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			String s[] = msg.split(" ");
			System.out.println("어절 개수 : " + s.length);
		}
		
		// 2-P_StringTockenizer)
		StringTokenizer st; // StringTokenizer
		while (true) {
			int count = 0; 
			System.out.println(">>"); // 글자를 입력할 때마다 count 변수를 초기화
			String msg = scan.nextLine();
			
			if (msg.equals("그만")) {
				System.out.println("종료합니다.");
				break;
			}
			
			st = new StringTokenizer(msg, " ");
			while(st.hasMoreTokens()) {
				st.nextToken();
				count++;
			}
			System.out.println("어절 개수 : " + count);
		}
		
	}

}
