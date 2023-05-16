package chap08;

import java.util.Random;
import java.util.Scanner;

// HangManGame 게임 구성
//=============================================
public class HangManGameEx {
// public은 파일 이름이랑 동일한 클래스에 붙여야 함

	// 1. 단어를 가져오기(Words클래스 이용)
	// 2. 글자 2개를 숨기기(HiddenWord) : 2개의 글자를 숨기고 해당 글자는 _ 표시로 바꾸기(숨긴 단어를 따로 자료구조에 저장)
	// 3. 글자를 하나씩 입력하는 method
	// - 숨긴 문자와 일치하면 정답 처리 -> "_" 대신 해당 문자로 교체하는 기능
	// 4. 2개까지 맞출 수 있는 method
	// 5. 직접 게임을 해줄 수 있는 method(void run())

	String randomWord;
	StringBuffer hiddenWord;
	Scanner scanner = new Scanner(System.in);
	final int blankMax = 2;
	// 언제든지 blank의 갯수를 바꿀 수 있도록 상수 필드로 지정
	final int trialMax = 3;
	
	
	 void hideLetters() {
		
		hiddenWord = new StringBuffer(randomWord);
		Random r = new Random();
		for(int i=0; i < blankMax; i++) {
			int index = r.nextInt(hiddenWord.length());
			char c = randomWord.charAt(index);
			// c는 원래 문자에서 가져온 letter
			for(int j = 0; j < randomWord.length(); j++) {
				if(hiddenWord.charAt(j) == c) {
					hiddenWord.setCharAt(j, '_');
				} 
			}
		}
	}
	// 실제 게임을 하는 메소드
		public boolean go() { // 반환 값이 true면 더 확장 가능
			boolean success = false; // 성공을 못 했다고 가정
			int count = 0; // 게임을 할 때마다 초기화 해줘야 함
//			scanner = new Scanner(System.in);
			while(true) {
				count++; // 글자 비교 횟수
				if(count > trialMax) break;
				// 만약에 첫번째 시도에 2글자를 다 맞춘다면?
				System.out.println(hiddenWord);
				System.out.print(">> ");
				String text = scanner.next();
				char key = text.charAt(0); // String으로 받아서 맨 처음의 한 글자만 key에 저장(String을 char로 변환)
				for (int i = 0; i < randomWord.length(); i++) {
					if(randomWord.charAt(i)==key && hiddenWord.charAt(i)=='_')
						hiddenWord.setCharAt(i, key);
					// trialMax까지 갈 필요 X
				}
				// randomWord와 hiddenWord는 지금 겉으로 동일한 상태
				// but) randomWord는 String이고 hiddenWord는 StringBuffer
				// String 객체를 생성해서 StringBuffer를 String으로 변환
				String msg = new String(hiddenWord);
				if(randomWord.equals(msg)) {success=true; break;}
			}
			return success; // 성공 여부를 반환
			}
	
	public void run() {
		System.out.println("행맨 게임 시작");
		Words word = new Words("C:/javaex/words.txt");
		// Word클래스 객체 생성(인자로 파일 이름 전달)
		// 파일을 입력받아서 내용을 readLine으로 읽어서 vector에 저장

		while (true) {
			randomWord = word.getRandomWord(); // 랜덤한 단어를 벡터에서 읽기
//			System.out.println(randomWord);
			hideLetters(); // 글자 2개를 랜덤하게 숨기기(from randomWord -> hiddenWord)
			// 게임 진행 -> 시도 횟수 내에서 글자를 완성시킴
			if(go()) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("FAIL");
			} 
			
			System.out.println("게임을 더 하시겠습니까? (y/n)");
			if (scanner.next().equals("n")) break;
		}

	}		
	

	public static void main(String[] args) {
		HangManGameEx game = new HangManGameEx();
		game.run();
	}

}

//	Word 클래스 구성 (생성자, 글자 1개를 추출하는 메소드)
// =============================================

