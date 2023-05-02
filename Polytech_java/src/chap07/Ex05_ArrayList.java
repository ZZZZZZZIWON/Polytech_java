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

		System.out.println("�л��̸�, �а�, �й�, ��������� comma(,)�� �����Ͽ� �Է��ϼ���>>");

		for (int i = 0; i < 4; i++) { // �Է¹��� ������ ArrayList�� ����
			st = new StringTokenizer(scan.nextLine(), ",");
			// �Է¹��� �� ���� ","�� �����ؼ� st�� tokenȭ�ż� ����
			while (st.hasMoreTokens()) {
				String name = st.nextToken().trim(); // �л��̸�
				String dept = st.nextToken().trim(); // �а�
				int id = Integer.parseInt(st.nextToken().trim());
				// st.nextToken�� String type�̶� Integer.parseInt�� ��ȯ�ؼ� Integer�� ��ȯ
				// ��ȯ�� IntegerŸ���� �����ڽ̵ż� int id�� ����
				double score = Double.parseDouble(st.nextToken().trim());

				s = new Student1(name, dept, id, score); // ������ method�� �־ �ʱ�ȭ �� Student��ü�� ����
				a.add(s); // ArrayList�� ������ Student1��ü���� ��

			}
		}

		for (Student1 ss : a) {
			System.out.println("�̸� 	: " + ss.getName());
			System.out.println("�а� 	: " + ss.getDept());
			System.out.println("�й� : " + ss.getId());
			System.out.println("������� : " + ss.getScore());
			System.out.println("=".repeat(30)); // repeat�޼ҵ� ���ϴ� ���� ���ϴ� ��ŭ �ݺ� ��°���
		}
		
		System.out.println("�л� �̸� >> ");
		String key = scan.next();
		Iterator<Student1> it = a.iterator();
		while(it.hasNext()) {
			Student1 ssss =it.next();
			if(ssss.getName().equals(key)) // it.next()�� Student1Ÿ��
			System.out.println(ssss);
		}
		
		
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
