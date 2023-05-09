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
		// stream을 연결해서 사용할 수 있음
		BufferedReader reader = new BufferedReader(is);
		String line;
		StringTokenizer st;

		while (!(line = reader.readLine()).equals("q")) {
			st = new StringTokenizer(line, " ");
			while (st.hasMoreTokens()) {
				map.put(st.nextToken(), st.nextToken());
			}
		}
		Scanner scan = new Scanner(System.in);

		System.out.println("총 " + map.size() + "개의 전화번호를 읽었습니다.");

		while (true) {
			System.out.print("이름>>");
			String name = scan.next();

			if (map.containsKey(name)) {
				String number = map.get(name);
				System.out.println(number);
			} else {
				System.out.println("찾는 이름이 없습니다.");
			}

			if (name.equals("그만")) {
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
