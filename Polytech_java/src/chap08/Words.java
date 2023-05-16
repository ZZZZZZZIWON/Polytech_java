package chap08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Vector;

class Words {

	static public Vector<String> wordVector = new Vector<String>();
	// static���� ���� -> Ŭ���� ���(Ŭ���� �̸����� ȣ�� ����)
	// ��� ���Ǿ�� �ϱ� ������ �ܺο� ����
	public Words(String fileName) {
		// Stream�� �̿��ص� ��
		// Scanner�� �̿� ����

		try (Scanner scan = new Scanner(new FileReader(fileName))) {
			
			while(scan.hasNext()) {
			String words = scan.nextLine();
			wordVector.add(words);
			}

		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
			System.exit(0); // 0�� ������ ���� ���� / -1�� ������ ���������� ���� ����
		}
	}
	
	

	public String getRandomWord() {

		final int WORDMAX = wordVector.size();
		// �ѹ� �ԷµǸ� �ٲ��� �ʱ� ������ ����� ����(vector�� size)
		int randomIndex = (int) (Math.random() * WORDMAX);
		// �Ǽ� ���� ������ ������ int�� casting(0���� WORDMAX���� 1 ���� �� ��ȯ)
		return wordVector.get(randomIndex);
	}


}