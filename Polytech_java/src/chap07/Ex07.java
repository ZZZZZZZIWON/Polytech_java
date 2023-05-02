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

		System.out.println("�̷����бݰ����ý����Դϴ�.");

		for (int i = 0; i < 5; i++) {
			System.out.println("�̸��� ����>>");
			st = new StringTokenizer(scan.nextLine(), " ");
			while(st.hasMoreTokens()) {
				String key = st.nextToken().trim();
				Double value = Double.parseDouble(st.nextToken().trim());
				
				h.put(key, value);
			}
		}
		System.out.println("����� ����� ���� : " + h.size());
		for (String ss : h.keySet()) {
			 System.out.println(h.get(ss)); // value�� ���
		}
		System.out.println("-".repeat(30));
		
//		1. 
//		System.out.println("���л� ���� ���� ���� �Է�>>");
//		double input = scan.nextDouble();
//		for(String sss: h.keySet())
//			if(h.get(sss) >= input)
//				System.out.println(sss);
		
//		2.
		System.out.println("���л� ���� ���� ���� �Է�>>");
		Double input = scan.nextDouble();
		Set<String> set = h.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Double score = h.get(name);
			if(score>=input) System.out.println(name);
		}
		
		Collection<Double> c = h.values(); // value���� �� �����ͼ� ����
		Iterator<Double> it2 = c.iterator(); // �����˻� - hasNext() - next()
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	
//		compute method? - merge 
//		containsKey?
//		containsValue?
//		values() - key���� ������ �� ����
//		API ������ �����ϸ鼭 ��� ������ �޼ҵ� ã��
		
	}

}
