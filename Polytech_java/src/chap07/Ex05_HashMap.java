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

		System.out.println("�л��̸�, �а�, �й�, ��������� comma(,)�� �����Ͽ� �Է��ϼ���>>");

		for (int i = 0; i < 4; i++) { 
			st = new StringTokenizer(scan.nextLine(), ",");
			while (st.hasMoreTokens()) {
				String name = st.nextToken().trim(); // �л��̸�
				String dept = st.nextToken().trim(); // �а�
				int id = Integer.parseInt(st.nextToken().trim());
				double score = Double.parseDouble(st.nextToken().trim());

				s = new Student1(name, dept, id, score); 
				h.put(name, s); // (key��, value��)

			}
		}

		System.out.println("����� ����� ���� : " + h.size());
		
//		Set<String> set = h.keySet(); 
//		Iterator<String> it = set.iterator();
//		// Ű ���� ������ �����˻��ؾ���(index�� ��� for���� ���� �� ����)
//		
//		while(it.hasNext()) {
//			System.out.println(h.get(it.next()));
//		}
		
		// key���� String Ÿ���̱� ������ String key�� �����ؼ� �ݺ������� ��������
		for (String key : h.keySet()) {
			System.out.println(h.get(key));
		}
		
//		System.out.println("�л� �̸� >> ");
//		String key = scan.next();
//		Iterator<Student1> it = .iterator();
//		while(it.hasNext()) {
//			Student1 ssss =it.next();
//			if(ssss.getName().equals(key)) // it.next()�� Student1Ÿ��
//			System.out.println(ssss);
//		}
		
		
//		while (true) {
//			System.out.print("�л� �̸� >>");
//			String input = scan.next();
//			for (Student1 ss : a) {
//				if (input.equals(ss.getName())) {
//					System.out.println(ss);
//				}
//			}
//			if (input.equals("�׸�")) {
//				System.out.println("�����մϴ�.");
//				break;
//			}
//
//		}

//		while(true ) {
//			System.out.println("�л� �̸� >> ");
//			String key = scan.next();
//			if(key.equals("�׸�")) {
//				System.out.println("�����մϴ�.");
//				break;
//			}
//			for(Student1 sss : a) {
//				sss.getName().trim().equals(key); 
//				//sss.getName()�� ��Ʈ���� ���ؼ� trim�� ���ְ� equals�� ����(method chaining)
//				System.out.println(sss);
//			}
//		}
			
		
	}
}
