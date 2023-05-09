package chap08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamEx {
	public static void main(String[] args) {
	
		InputStreamReader is;
		
		try { 
			is = new InputStreamReader(new FileInputStream("C:\\javaex\\ex.txt"), "UTF-8");
			int c;
			while((c=is.read())!=-1) {
				System.out.print((char)c);
			}		
			is.close(); 
	    }
		catch (IOException e) {
			e.printStackTrace();
			// console�� error message ���
		}
}
}
// txt������ UTF-8�̰� ��Ŭ���� �� java������ encoding ����� MS949�̱� ������ ���� �ʿ�
// ��� ����� encoding�� �� �� �ֵ��� FileInputStream�� �̿�
// 1. FileInputStream���� ���� ���� (1byte������)
// 2. UTF-8�� ���ڵ������ �ٲ㼭 InputStreamReader�� ��ȯ
