package chap07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Ex07 {
	public static void main(String[] args) {
		HashMap<String, Double> h = new HashMap<String, Double>();
		Scanner scan = new Scanner(System.in);
		StringTokenizer st;

		System.out.println("미래장학금관리시스템입니다.");

		for (int i = 0; i < 5; i++) {
			System.out.println("이름과 학점>>");
			st = new StringTokenizer(scan.nextLine(), " ");
			while(st.hasMoreTokens()) {
				String key = st.nextToken().trim();
				Double value = Double.parseDouble(st.nextToken().trim());
				
				h.put(key, value);
			}
		}
		System.out.println("저장된 요소의 개수 : " + h.size());
		for (String ss : h.keySet()) {
			 System.out.println(h.get(ss)); // value값 출력
		}
		System.out.println("-".repeat(30));
		
//		1. 
//		System.out.println("장학생 선발 학점 기준 입력>>");
//		double input = scan.nextDouble();
//		for(String sss: h.keySet())
//			if(h.get(sss) >= input)
//				System.out.println(sss);
		
//		2.
		System.out.println("장학생 선발 학점 기준 입력>>");
		Double input = scan.nextDouble();
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Double score = h.get(name);
			if(score>=input) System.out.println(name);
		}
		
		Collection<Double> c = h.values(); // value들을 다 가져와서 저장
		Iterator<Double> it2 = c.iterator(); // 순차검색 - hasNext() - next()
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	
//		compute method? - merge 
//		containsKey?
//		containsValue?
//		values() - key값을 가져올 수 없음
//		API 문서들 정독하면서 사용 가능한 메소드 찾기
		
	}

}
