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
		
//		System.out.println("����="+com);
		while (true) {
			count++;
			if (count > TRYNUM) {
				state = false;
				break;
			}
			
		
			System.out.print("1~99 �� �ϳ��� �Է��ϼ���.");
			int user = scan.nextInt();

			if (com == user) {
				System.out.println("���� ����!");
				break;
			}

			else if (com > user)
				System.out.println("UP ����!");
			else
				System.out.println("DOWN ����!");
				
		}
		System.out.println("==============");
		
		if (state)
			System.out.println("�̰��!");
		else {
			System.out.println(count-1+ "!");
			System.out.println("�����ߴ�!");
		}
			
			scan.close();

	}
}
