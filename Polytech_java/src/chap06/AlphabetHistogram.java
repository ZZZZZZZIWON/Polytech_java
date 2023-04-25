package chap06;


import java.util.Scanner;

public class AlphabetHistogram {
	int histData[] = new int[26];
	
	 AlphabetHistogram() {
		for (int i = 0; i < histData.length; i++) {
			histData[i] = 0;
		}
		
	}

	// �ؽ�Ʈ�� �Է¹޾� �ϳ��� StringBuffer�� ���̰�, String���� �����Ͽ� �����ϴ� �޼ҵ�
	String readString() {
		StringBuffer sb = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		while(true) {
			String line = scan.nextLine();
			if(line.length() == 1 && line.charAt(0) == ';')
				break;
			sb.append(line);
		}
		scan.close();
		return sb.toString();
	}
	
	// readString�� ���� ������ �� �ؽ�Ʈ�� ���ĺ����� ī��Ʈ�ϴ� �޼ҵ�
	void checkAlphabet(String msg) {
		msg = msg.toUpperCase();
		int index;
		for (int i = 0; i < msg.length(); i++) {
			char c = msg.charAt(i);
			if(c >='A' && c <='Z') {
				index = c - 'A';
				histData[index]++;
			}
		}		
	}
	// Histogram�� �׸��� �޼ҵ� (���� ���·� ����)
	void drawHistogram() {
		for (int i = 0; i < histData.length; i++) {
			System.out.print((char)(i + 'A') + " : "); // 
			for (int j = 0; j < histData[i]; j++) 
				System.out.print("#");
				
			System.out.println();
		}
	}
	
	// ������ ���ִ� �޼ҵ� : readString -> checkAlphabet -> drawHistogram (����)
	void run() {
		checkAlphabet(readString()); // readString()���� ��ȯ�ϴ� String�� �ٷ� checkAlphabet�� �Ű������� Ȱ��
		drawHistogram();
	}
	
	public static void main(String[] args) {
		AlphabetHistogram al = new AlphabetHistogram();
		al.run();
		
	}
}
