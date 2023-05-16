package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

class Words {

	static public Vector<String> wordVector = new Vector<String>();
	// static으로 변경 -> 클래스 멤버(클래스 이름으로 호출 가능)
	// 계속 사용되어야 하기 때문에 외부에 생성
	public Words(String fileName) {
		// Stream을 이용해도 됨
		// Scanner를 이용 가능

		try (Scanner scan = new Scanner(new FileReader(fileName))) {
			
			while(scan.hasNext()) {
			String words = scan.nextLine();
			wordVector.add(words);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0); // 0을 넣으면 정상 종료 / -1을 넣으면 비정상적인 종료 가능
		}
	}
	
	

	public String getRandomWord() {

		final int WORDMAX = wordVector.size();
		// 한번 입력되면 바뀌지 않기 때문에 상수로 지정(vector의 size)
		int randomIndex = (int) (Math.random() * WORDMAX);
		// 실수 값이 나오기 때문에 int로 casting(0부터 WORDMAX보다 1 작은 값 반환)
		return wordVector.get(randomIndex);
	}


}