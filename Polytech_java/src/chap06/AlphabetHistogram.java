package chap06;


import java.util.Scanner;

public class AlphabetHistogram {
	int histData[] = new int[26];
	
	 AlphabetHistogram() {
		for (int i = 0; i < histData.length; i++) {
			histData[i] = 0;
		}
		
	}

	// 텍스트를 입력받아 하나의 StringBuffer로 붙이고, String으로 변경하여 리턴하는 메소드
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
	
	// readString을 통해 가지고 온 텍스트를 알파벳별로 카운트하는 메소드
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
	// Histogram을 그리는 메소드 (여러 형태로 가능)
	void drawHistogram() {
		for (int i = 0; i < histData.length; i++) {
			System.out.print((char)(i + 'A') + " : "); // 
			for (int j = 0; j < histData[i]; j++) 
				System.out.print("#");
				
			System.out.println();
		}
	}
	
	// 동작을 해주는 메소드 : readString -> checkAlphabet -> drawHistogram (조립)
	void run() {
		checkAlphabet(readString()); // readString()에서 반환하는 String을 바로 checkAlphabet의 매개변수로 활용
		drawHistogram();
	}
	
	public static void main(String[] args) {
		AlphabetHistogram al = new AlphabetHistogram();
		al.run();
		
	}
}
