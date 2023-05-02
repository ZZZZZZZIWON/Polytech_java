package chap07;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);

		Iterator<Integer> it = v.iterator(); // Vector v를 이용해서 iterator() 사용
		while (it.hasNext()) { // 순차검색할 데이터가 있는지 여부 체크(코드가 간결해짐)
			System.out.println(it.next());
		}
	}
}
