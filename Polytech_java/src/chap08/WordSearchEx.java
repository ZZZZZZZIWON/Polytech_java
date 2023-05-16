package chap08;

import java.util.Scanner;

public class WordSearchEx {

	Words word;
	Scanner scan = new Scanner(System.in);
	int count;
	
	// 1. 단어 검색
	boolean go() {
		boolean success = false;
		count = 0;
		System.out.println("단어 >> ");
		String search = scan.next();

		// 코드 1 : 검색하는 기능
		for(String ss : Words.wordVector) {
//			wordVector에는 String객체들이 저장되어 있음
			if(ss.length() >= search.length()) { // substring보다는 길어야 함
				String front = ss.substring(0, search.length());
				// 1글자인데 3글자를 검색하면 StringIndexOutOfBounds exception 발생
				if(search.equals(front))
					System.out.println(ss);
					success=true;
					count++;
			}
		}
		
		// 코드 2 : 검색하는 기능(exception 활용)
		for(String ss : Words.wordVector) {
			try {
				String front = ss.substring(0, search.length());
				if(search.equals(front)) {
					System.out.println(ss);
					success = true;
					count++;
				}
			}
			catch(StringIndexOutOfBoundsException e) {
				continue;
			}
		}
		
		return success;
	}
	
	// 2. 단어 찾기 게임
	void run() {
		System.out.println("단어 찾기 시작");
		 word = new Words("C:/javaex/words.txt"); // 파일을 읽어서 vector에 넣는 클래스
		 // wordVector는 변하지 않기 때문에 static이어도 상관 X(-> 클래스 이름으로 호출 가능)
		 scan = new Scanner(System.in);
		 while(true) {
			 if(go()) {
//				 System.out.println(count + "개 검색 완료");
			 }
			 else {
				 System.out.println("찾는 단어가 없습니다.");
			 }
			 System.out.println("계속 검색하시겠습니까? (y/n)");
			 if(scan.next().equals("n")) {
				 break;
			 }
		 }
		
	}
	
	public static void main(String[] args) {
		WordSearchEx ex = new WordSearchEx();
		ex.run();
		// run()은 static이 아니기 때문에 클래스에 대한 객체를 생성 후 객체로 run()메소드를 호출
	}
}
