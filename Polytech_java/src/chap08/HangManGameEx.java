package chap08;

import java.util.Random;
import java.util.Scanner;

// HangManGame ���� ����
//=============================================
public class HangManGameEx {
// public�� ���� �̸��̶� ������ Ŭ������ �ٿ��� ��

	// 1. �ܾ ��������(WordsŬ���� �̿�)
	// 2. ���� 2���� �����(HiddenWord) : 2���� ���ڸ� ����� �ش� ���ڴ� _ ǥ�÷� �ٲٱ�(���� �ܾ ���� �ڷᱸ���� ����)
	// 3. ���ڸ� �ϳ��� �Է��ϴ� method
	// - ���� ���ڿ� ��ġ�ϸ� ���� ó�� -> "_" ��� �ش� ���ڷ� ��ü�ϴ� ���
	// 4. 2������ ���� �� �ִ� method
	// 5. ���� ������ ���� �� �ִ� method(void run())

	String randomWord;
	StringBuffer hiddenWord;
	Scanner scanner = new Scanner(System.in);
	final int blankMax = 2;
	// �������� blank�� ������ �ٲ� �� �ֵ��� ��� �ʵ�� ����
	final int trialMax = 3;
	
	
	 void hideLetters() {
		
		hiddenWord = new StringBuffer(randomWord);
		Random r = new Random();
		for(int i=0; i < blankMax; i++) {
			int index = r.nextInt(hiddenWord.length());
			char c = randomWord.charAt(index);
			// c�� ���� ���ڿ��� ������ letter
			for(int j = 0; j < randomWord.length(); j++) {
				if(hiddenWord.charAt(j) == c) {
					hiddenWord.setCharAt(j, '_');
				} 
			}
		}
	}
	// ���� ������ �ϴ� �޼ҵ�
		public boolean go() { // ��ȯ ���� true�� �� Ȯ�� ����
			boolean success = false; // ������ �� �ߴٰ� ����
			int count = 0; // ������ �� ������ �ʱ�ȭ ����� ��
//			scanner = new Scanner(System.in);
			while(true) {
				count++; // ���� �� Ƚ��
				if(count > trialMax) break;
				// ���࿡ ù��° �õ��� 2���ڸ� �� ����ٸ�?
				System.out.println(hiddenWord);
				System.out.print(">> ");
				String text = scanner.next();
				char key = text.charAt(0); // String���� �޾Ƽ� �� ó���� �� ���ڸ� key�� ����(String�� char�� ��ȯ)
				for (int i = 0; i < randomWord.length(); i++) {
					if(randomWord.charAt(i)==key && hiddenWord.charAt(i)=='_')
						hiddenWord.setCharAt(i, key);
					// trialMax���� �� �ʿ� X
				}
				// randomWord�� hiddenWord�� ���� ������ ������ ����
				// but) randomWord�� String�̰� hiddenWord�� StringBuffer
				// String ��ü�� �����ؼ� StringBuffer�� String���� ��ȯ
				String msg = new String(hiddenWord);
				if(randomWord.equals(msg)) {success=true; break;}
			}
			return success; // ���� ���θ� ��ȯ
			}
	
	public void run() {
		System.out.println("��� ���� ����");
		Words word = new Words("C:/javaex/words.txt");
		// WordŬ���� ��ü ����(���ڷ� ���� �̸� ����)
		// ������ �Է¹޾Ƽ� ������ readLine���� �о vector�� ����

		while (true) {
			randomWord = word.getRandomWord(); // ������ �ܾ ���Ϳ��� �б�
//			System.out.println(randomWord);
			hideLetters(); // ���� 2���� �����ϰ� �����(from randomWord -> hiddenWord)
			// ���� ���� -> �õ� Ƚ�� ������ ���ڸ� �ϼ���Ŵ
			if(go()) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("FAIL");
			} 
			
			System.out.println("������ �� �Ͻðڽ��ϱ�? (y/n)");
			if (scanner.next().equals("n")) break;
		}

	}		
	

	public static void main(String[] args) {
		HangManGameEx game = new HangManGameEx();
		game.run();
	}

}

//	Word Ŭ���� ���� (������, ���� 1���� �����ϴ� �޼ҵ�)
// =============================================

