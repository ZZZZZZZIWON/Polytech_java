package chap07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		// 문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();

		// 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>> ");
			a.add(scan.next()); // 사용자에게 받은 이름을 바로 add로 삽입(중간 변수를 거칠 필요 X)
		}

		// ArrayList에 들어있는 모든 이름 출력
		for (String name : a) {
			System.out.print(name);
		}

		// 가장 긴 이름 출력하기(data를 찾을 때는 index로 접근하기)
		int longestIndex = 0;
		for (int i = 1; i < a.size(); i++) {
			if(a.get(i).length() > a.get(longestIndex).length())
				// get하면 각각의 String(name)값이 나오고 그 값의 length(문자열의 길이)를 비교
				longestIndex = i;
			
			System.out.println("가장 긴 이름 : " + a.get(longestIndex));
		}
	}

}
