package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket sc = new ServerSocket(5000);
			Socket s = sc.accept();
			System.out.println("## ���� ����");

			while(true) {
			BufferedReader br = new BufferedReader (new InputStreamReader(s.getInputStream()));
			System.out.println("## Ŭ���̾�Ʈ ����");
			System.out.println("## Ŭ���̾�Ʈ �޽���: " + br.readLine());
			br.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
