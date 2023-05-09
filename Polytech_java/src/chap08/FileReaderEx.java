package chap08;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

// 1. 예외상황 처리 : throws 활용

//public class FileReaderEx {
//	public static void main(String[] args) throws IOException {
//		// file과 관련된 에러를 처리하기 위한 IOException (file보다 상위)
//		// IOException => input output과 관련된 모든 예외상황(ex-file open)
//		
//		// #예외처리 2가지
//		//	1. (method) throws IOException {}
//		//	2. try {정상구문}
////				catch(IOException) {e.print---}
////				finally {마지막 구문 (정상구문 후에)}
//		FileReader fin = new FileReader("C:\\javaex\\ex.txt");
//		// 괄호 안에는 파일의 경로
//		// 파일이 없을 경우 throws declaration or try/catch
//		// 알아서 FileNotFoundException 에러 처리
//		// 2byte type으로 불러옴(아스키코드)
//		int c;
//		while((c=fin.read())!=-1) {
//			System.out.println((char)c);
//			
//		}
//		fin.close();
//	}
//}

//2. 예외 상황 처리 : try - catch

public class FileReaderEx {
	public static void main(String[] args) {
	
		FileReader fin;
	
		try {
			fin = new FileReader("C:\\javaex\\ex.txt", Charset.forName("UTF-8"));
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}		
			fin.close(); 
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
