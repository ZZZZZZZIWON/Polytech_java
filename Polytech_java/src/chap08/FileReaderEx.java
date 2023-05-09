package chap08;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

// 1. ���ܻ�Ȳ ó�� : throws Ȱ��

//public class FileReaderEx {
//	public static void main(String[] args) throws IOException {
//		// file�� ���õ� ������ ó���ϱ� ���� IOException (file���� ����)
//		// IOException => input output�� ���õ� ��� ���ܻ�Ȳ(ex-file open)
//		
//		// #����ó�� 2����
//		//	1. (method) throws IOException {}
//		//	2. try {���󱸹�}
////				catch(IOException) {e.print---}
////				finally {������ ���� (���󱸹� �Ŀ�)}
//		FileReader fin = new FileReader("C:\\javaex\\ex.txt");
//		// ��ȣ �ȿ��� ������ ���
//		// ������ ���� ��� throws declaration or try/catch
//		// �˾Ƽ� FileNotFoundException ���� ó��
//		// 2byte type���� �ҷ���(�ƽ�Ű�ڵ�)
//		int c;
//		while((c=fin.read())!=-1) {
//			System.out.println((char)c);
//			
//		}
//		fin.close();
//	}
//}

//2. ���� ��Ȳ ó�� : try - catch

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
			// console�� error message ���
		}
}
}
// txt������ UTF-8�̰� ��Ŭ���� �� java������ encoding ����� MS949�̱� ������ ���� �ʿ�
// ��� ����� encoding�� �� �� �ֵ��� FileInputStream�� �̿�
// 1. FileInputStream���� ���� ���� (1byte������)
// 2. UTF-8�� ���ڵ������ �ٲ㼭 InputStreamReader�� ��ȯ
