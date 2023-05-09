package chap08;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) {

		FileWriter fout = null;
		Scanner scan = new Scanner(System.in);
		try {
			fout = new FileWriter("c:\\javaex\\test.txt", true);
			// true를 쓰면 append 가능하다고 선언
			while (true) {
				String line = scan.nextLine();
				if (line.length() == 0) 
					break; // 아무것도 입력된 게 없으면 break
//				fout.write(line, 0, line.length()); // 입력 된 후 모든 data가 한 줄에 입력됨
//				fout.write("\r\n", 0, 2);
				
				fout.append(line, 0, line.length());
				fout.append("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
		scan.close();
	}
}