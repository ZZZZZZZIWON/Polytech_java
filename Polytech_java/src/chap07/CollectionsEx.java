package chap07;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsEx {
	public static void printList(LinkedList<String> ll) {
		// static�� ���̸� ���� ��ü�� ���� �ʿ� X -> �ٷ� printList�� main���� ȣ�� ����
		// LinkedList type�� ���ڷ� ����
		Iterator<String> it = ll.iterator();
		// iterator()�� return type�� Iterator type
		// iterator = ���� �˻��� ��ȸ�� �ϱ� ���� ����
		
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
		myList.add("Ʈ��������");
		myList.add("��Ÿ����");
		myList.add("��Ʈ����");
		myList.add(0, "�͹̳�����");
		myList.add(2, "�ƹ�Ÿ"); // ������ index�� ����Ű�� ��ġ�� ����
		printList(myList);

		Collections.sort(myList); // ��� ����
		printList(myList);


		// ����� ������ �ݴ��
		Collections.reverse(myList);
		printList(myList);
		
		// ����Ž��
		int index = Collections.binarySearch(myList, "�ƹ�Ÿ")+1;
		System.out.println("�ƹ�Ÿ�� "+(index) + "������ �ֽ��ϴ�.");
	}
}
