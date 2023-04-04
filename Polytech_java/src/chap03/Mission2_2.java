package chap03;

import java.util.Random;
import java.util.Scanner;

public class Mission2_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random rand = new Random();
		int count = 0;
		final int TRYNUM = 7;
		boolean state = true;
		int com = 1 + rand.nextInt(99);
		rand.setSeed(System.currentTimeMillis());
//		System.out.println(System.currentTimeMillis());
		
//		System.out.println("정답="+com);
		while (true) {
			count++;
			if (count > TRYNUM) {
				state = false;
				break;
			}
			
		
			System.out.print("1~99 중 하나를 입력하세요.");
			int user = scan.nextInt();

			if (com == user) {
				System.out.println("게임 성공!");
				break;
			}

			else if (com > user)
				System.out.println("UP 시켜!");
			else
				System.out.println("DOWN 시켜!");
				
		}
		System.out.println("==============");
		
		if (state)
			System.out.println("이겼다!");
		else {
			System.out.println(count-1+ "!");
			System.out.println("실패했다!");
		}
			
			scan.close();

	}
}
