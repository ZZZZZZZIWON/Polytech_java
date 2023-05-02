package chap07;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public void printVector(Vector <Integer> v) {
		for (Integer i : v) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
//		Vector<Integer> v = new Vector<>();
		Vector<Integer> v = new Vector<Integer>();
		// VectorEx클래스에 있는 printVector메소드를 호출하려면 객체를 생성 후에 접근
		VectorEx ex = new VectorEx();
		
		// int형의 데이터가 Integer로 자동박싱되면서 저장
		v.add(5);	
		v.add(4); 
		v.add(-1);
		v.add(6);
		
//		v.add(new Integer(6)); 굳이 할 필요 없음
		
		// 원하는 중간 위치에 삽입 가능(index 2의 자리에 7 삽입)
		v.add(2, 7); 
		
		System.out.println("벡터 객체의 요소 갯수 : " + v.size());
		System.out.println("벡터 현재 용랑 : " + v.capacity());
		
//		for (int i = 0; i < v.size(); i++) {
//			System.out.println("요소 : " + v.get(i));
//		}
//		
//		// 벡터의 모든 요소를 포함하는 배열 리턴
//		Object[] vArray = v.toArray();
//		for (Object vv : vArray) {
//			System.out.print(vv + " ");
//		}
//		
//		System.out.println();
//		
//		// v 자체를 가져와서 그 안의 객체를 하나씩 꺼내기
//		for(Integer i : v) System.out.println(i);
		
		// v 자체를 가져와서 그 안의 객체를 다 더하기
		int sum=0;
		for(Integer i : v) 
			sum+= i;
			System.out.println("sum : " + sum);
		
		// printVector메소드 호출
		ex.printVector(v); // 파라미터로 Vector<Integer>타입을 전달(v)
		
		

		
	}

}
