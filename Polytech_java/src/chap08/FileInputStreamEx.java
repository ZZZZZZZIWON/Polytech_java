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
			// console에 error message 출력
		}
}
}
// txt파일은 UTF-8이고 이클립스 내 java파일의 encoding 방식은 MS949이기 떄문에 맞춤 필요
// 모든 방식의 encoding을 할 수 있도록 FileInputStream을 이용
// 1. FileInputStream으로 파일 열기 (1byte단위로)
// 2. UTF-8로 인코딩방식을 바꿔서 InputStreamReader로 반환
