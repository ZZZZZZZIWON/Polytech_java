package chap07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	public static void printList(LinkedList<String> ll) {
		// static을 붙이면 굳이 객체를 만들 필요 X -> 바로 printList를 main에서 호출 가능
		// LinkedList type을 인자로 받음
		Iterator<String> it = ll.iterator();
		// iterator()의 return type은 Iterator type
		// iterator = 단지 검색과 순회를 하기 위한 도구
		
		while(it.hasNext()) {
			String e = it.next();
			String separator;
			if(it.hasNext())
				separator = "=>";
			else
				separator = "\n";
			System.out.print(e + separator);
		}
	}

	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타"); // 지정된 index가 가리키는 위치에 삽입
		printList(myList);

		Collections.sort(myList); // 요소 정렬
		printList(myList);


		// 요소의 순서를 반대로
		Collections.reverse(myList);
		printList(myList);
		
		// 이진탐색
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+(index) + "번쨰에 있습니다.");
	}
}
