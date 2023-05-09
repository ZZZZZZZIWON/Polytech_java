package chap07.Ex07_7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudent3Ex {

		

	public static void main(String[] args) {
		HashMap<String, Student3> map = new HashMap<String, Student3>();
		// Student3 객체를 생성해도 되지만 이 코드에서는 사용할 일이 별로 없음
		// 현재 사용할 수 있는 Studnet3 생성자는 Student3(int id, String tel)가 유일
		map.put("황기태", new Student3(1, "010-111-1111") );
		map.put("이재뮨", new Student3(2, "010-222-2222") );
		map.put("김남윤", new Student3(3, "010-333-3333") );
		
		Scanner scan = new Scanner(System.in);
			
		while(true) {
			System.out.println("검색할 이름?");
			String name = scan.nextLine();
			if(name.equals("exit")) break;
			
			if(name==null) {
				System.out.println("다시 검색하세요");
				
			}
			System.out.println(map.get(name));
			// name이라는 key값에 저장한 value인 Student3객체를 꺼내서 저장
			
		}
	
	}
}
