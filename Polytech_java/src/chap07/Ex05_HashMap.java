package chap07;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex05_HashMap {
	
	public static void main(String[] args) {
		HashMap<String, Student1> h = new HashMap<String, Student1>();		
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;
		Student1 s;

		System.out.println("학생이름, 학과, 학번, 학점평균을 comma(,)로 구분하여 입력하세요>>");

		for (int i = 0; i < 4; i++) { 
			st = new StringTokenizer(scan.nextLine(), ",");
			while (st.hasMoreTokens()) {
				String name = st.nextToken().trim(); // 학생이름
				String dept = st.nextToken().trim(); // 학과
				int id = Integer.parseInt(st.nextToken().trim());
				double score = Double.parseDouble(st.nextToken().trim());

				s = new Student1(name, dept, id, score); 
				h.put(name, s); // (key값, value값)

			}
		}

		System.out.println("저장된 요소의 개수 : " + h.size());
		
//		Set<String> set = h.keySet(); 
//		Iterator<String> it = set.iterator();
//		// 키 값을 가지고 순차검색해야함(index가 없어서 for문을 돌릴 수 없음)
//		
//		while(it.hasNext()) {
//			System.out.println(h.get(it.next()));
//		}
		
		// key값이 String 타입이기 때문에 String key에 저장해서 반복문으로 가져오기
		for (String key : h.keySet()) {
			System.out.println(h.get(key));
		}
		
//		System.out.println("학생 이름 >> ");
//		String key = scan.next();
//		Iterator<Student1> it = .iterator();
//		while(it.hasNext()) {
//			Student1 ssss =it.next();
//			if(ssss.getName().equals(key)) // it.next()가 Student1타입
//			System.out.println(ssss);
//		}
		
		
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
