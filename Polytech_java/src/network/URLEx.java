package network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx {
	
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.google.com");
//		System.out.println(url.getProtocol());
//		System.out.println(url.getHost());
		System.out.println(">> HTML 시작하기");
		
		InputStream is = url.openStream(); // InputStream 형태로 is에 url의 정보가 byte단위로 들어오는 stream
		BufferedReader br = new BufferedReader(new InputStreamReader(is)); // byte단위를 buffer단위로 변경해서 br에 저장
		// br.readline으로 내용을 가져올 수 있음
		String msg;
		while ((msg=br.readLine()) != null) {
			System.out.println(msg);
		}
		br.close();
		is.close();
	}

}
