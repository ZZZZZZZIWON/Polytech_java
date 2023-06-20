package network;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		try {
			Socket s = new Socket("127.0.0.1", 5000);
			System.out.println("## 클라이언트 실행");
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			pw.println("데이터 전송 테스트 중");
			pw.close();
			s.close();
			System.out.println("## 클라이언트 종료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
