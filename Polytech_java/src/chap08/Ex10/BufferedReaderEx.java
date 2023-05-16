package chap08.Ex10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
//		BufferedReaderEx be = new BufferedReaderEx();
		HashMap<String, String> map = new HashMap<>();

		File f = new File("C:\\javaex\\phone.txt");

		InputStreamReader is = new InputStreamReader(new FileInputStream(f), "UTF-8");
		// inputstreamReader�� 1byte�� 2byte(����)�� ��ȯ
		// stream�� �����ؼ� ����� �� ����
		BufferedReader reader = new BufferedReader(is);
		String line;
		StringTokenizer st;

		while (!(line = reader.readLine()).equals("q")) {
			// reader���� readLine() enter�� �Է� 
			// "������ 010-111-1111"�� readLine()���� �о line�� ����
			st = new StringTokenizer(line, " ");
			while (st.hasMoreTokens()) {
				map.put(st.nextToken(), st.nextToken());
				// ù��° st.nextToken���� key, st.nextToken���� value
			}
		}
		Scanner scan = new Scanner(System.in);
		// ()�ȿ��� �ܺ��� ���ϵ� ����(*) -> ������ method ã�ƺ���(*)
		// ����ڰ� �Է��� ������ ����� ������ in���� ������
		
		System.out.println("�� " + map.size() + "���� ��ȭ��ȣ�� �о����ϴ�.");

		while (true) {
			System.out.print("�̸�>>");
			String name = scan.next();

			if (map.containsKey(name)) {
				String phone = map.get(name);
				System.out.println(phone);
			} else {
				System.out.println("ã�� �̸��� �����ϴ�.");
			}

			if (name.equals("�׸�")) {
				break;
			}
		}

		FileWriter fout = new FileWriter(f);
		
		while(true) {
			
			String line1 = scan.nextLine();
			if(line.length()==0)
				break;
			fout.append(line, 0, line.length());
			fout.append("\r\n", 0, 2);
		}
		fout.close();
	}
}
