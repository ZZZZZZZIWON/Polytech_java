package chap07.Ex07_7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudent3Ex {

		

	public static void main(String[] args) {
		HashMap<String, Student3> map = new HashMap<String, Student3>();
		// Student3 ��ü�� �����ص� ������ �� �ڵ忡���� ����� ���� ���� ����
		// ���� ����� �� �ִ� Studnet3 �����ڴ� Student3(int id, String tel)�� ����
		map.put("Ȳ����", new Student3(1, "010-111-1111") );
		map.put("�����", new Student3(2, "010-222-2222") );
		map.put("�賲��", new Student3(3, "010-333-3333") );
		
		Scanner scan = new Scanner(System.in);
			
		while(true) {
			System.out.println("�˻��� �̸�?");
			String name = scan.nextLine();
			if(name.equals("exit")) break;
			
			if(name==null) {
				System.out.println("�ٽ� �˻��ϼ���");
				
			}
			System.out.println(map.get(name));
			// name�̶�� key���� ������ value�� Student3��ü�� ������ ����
			
		}
	
	}
}
