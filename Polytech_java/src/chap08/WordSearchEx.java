package chap08;

import java.util.Scanner;

public class WordSearchEx {

	Words word;
	Scanner scan = new Scanner(System.in);
	int count;
	
	// 1. �ܾ� �˻�
	boolean go() {
		boolean success = false;
		count = 0;
		System.out.println("�ܾ� >> ");
		String search = scan.next();

		// �ڵ� 1 : �˻��ϴ� ���
		for(String ss : Words.wordVector) {
//			wordVector���� String��ü���� ����Ǿ� ����
			if(ss.length() >= search.length()) { // substring���ٴ� ���� ��
				String front = ss.substring(0, search.length());
				// 1�����ε� 3���ڸ� �˻��ϸ� StringIndexOutOfBounds exception �߻�
				if(search.equals(front))
					System.out.println(ss);
					success=true;
					count++;
			}
		}
		
		// �ڵ� 2 : �˻��ϴ� ���(exception Ȱ��)
		for(String ss : Words.wordVector) {
			try {
				String front = ss.substring(0, search.length());
				if(search.equals(front)) {
					System.out.println(ss);
					success = true;
					count++;
				}
			}
			catch(StringIndexOutOfBoundsException e) {
				continue;
			}
		}
		
		return success;
	}
	
	// 2. �ܾ� ã�� ����
	void run() {
		System.out.println("�ܾ� ã�� ����");
		 word = new Words("C:/javaex/words.txt"); // ������ �о vector�� �ִ� Ŭ����
		 // wordVector�� ������ �ʱ� ������ static�̾ ��� X(-> Ŭ���� �̸����� ȣ�� ����)
		 scan = new Scanner(System.in);
		 while(true) {
			 if(go()) {
//				 System.out.println(count + "�� �˻� �Ϸ�");
			 }
			 else {
				 System.out.println("ã�� �ܾ �����ϴ�.");
			 }
			 System.out.println("��� �˻��Ͻðڽ��ϱ�? (y/n)");
			 if(scan.next().equals("n")) {
				 break;
			 }
		 }
		
	}
	
	public static void main(String[] args) {
		WordSearchEx ex = new WordSearchEx();
		ex.run();
		// run()�� static�� �ƴϱ� ������ Ŭ������ ���� ��ü�� ���� �� ��ü�� run()�޼ҵ带 ȣ��
	}
}
