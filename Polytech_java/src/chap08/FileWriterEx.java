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
			// true�� ���� append �����ϴٰ� ����
			while (true) {
				String line = scan.nextLine();
				if (line.length() == 0) 
					break; // �ƹ��͵� �Էµ� �� ������ break
//				fout.write(line, 0, line.length()); // �Է� �� �� ��� data�� �� �ٿ� �Էµ�
//				fout.write("\r\n", 0, 2);
				
				fout.append(line, 0, line.length());
				fout.append("\r\n", 0, 2);
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("���� ����� ����");
		}
		scan.close();
	}
}