package chap07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex05_ArrayList {
	public static void main(String[] args) {
		ArrayList<Student1> a = new ArrayList<Student1>();
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		Student1 s;

		System.out.println("학생이름, 학과, 학번, 학점평균을 comma(,)로 구분하여 입력하세요>>");

		for (int i = 0; i < 4; i++) { // 입력받은 정보를 ArrayList에 저장
			st = new StringTokenizer(scan.nextLine(), ",");
			// 입력받은 한 줄을 ","로 구분해서 st에 token화돼서 저장
			while (st.hasMoreTokens()) {
				String name = st.nextToken().trim(); // 학생이름
				String dept = st.nextToken().trim(); // 학과
				int id = Integer.parseInt(st.nextToken().trim());
				// st.nextToken은 String type이라서 Integer.parseInt로 변환해서 Integer로 변환
				// 변환된 Integer타입이 오토언박싱돼서 int id에 저장
				double score = Double.parseDouble(st.nextToken().trim());

				s = new Student1(name, dept, id, score); // 생성자 method에 넣어서 초기화 후 Student객체에 넣음
				a.add(s); // ArrayList에 각각의 Student1객체들이 들어감

			}
		}

		for (Student1 ss : a) {
			System.out.println("이름 	: " + ss.getName());
			System.out.println("학과 	: " + ss.getDept());
			System.out.println("학번 : " + ss.getId());
			System.out.println("학점평균 : " + ss.getScore());
			System.out.println("=".repeat(30)); // repeat메소드 원하는 값을 원하는 만큼 반복 출력가능
		}
		
		System.out.println("학생 이름 >> ");
		String key = scan.next();
		Iterator<Student1> it = a.iterator();
		while(it.hasNext()) {
			Student1 ssss =it.next();
			if(ssss.getName().equals(key)) // it.next()가 Student1타입
			System.out.println(ssss);
		}
		
		
//		while (true) {
//			System.out.print("학생 이름 >>");
//			String input = scan.next();
//			for (Student1 ss : a) {
//				if (input.equals(ss.getName())) {
//					System.out.println(ss);
//				}
//			}
//			if (input.equals("그만")) {
//				System.out.println("종료합니다.");
//				break;
//			}
//
//		}

//		while(true ) {
//			System.out.println("학생 이름 >> ");
//			String key = scan.next();
//			if(key.equals("그만")) {
//				System.out.println("종료합니다.");
//				break;
//			}
//			for(Student1 sss : a) {
//				sss.getName().trim().equals(key); 
//				//sss.getName()의 스트링에 대해서 trim을 해주고 equals를 해줌(method chaining)
//				System.out.println(sss);
//			}
//		}
				
		
	}
}
