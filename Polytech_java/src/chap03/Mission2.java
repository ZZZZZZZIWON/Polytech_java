package chap03;

import java.util.Random;
import java.util.Scanner;

// user�� com�� �ִ�.
// user�� 1,2,3 - ����, ����, ��
// com �� random�ϰ� ��ǻ�Ͱ� �����Ѵ�.
// 1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�.
// if �Ǵ� switch �߿� �����ؼ� ���α׷� �ۼ�

public class Mission2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1) Math.random() �޼ҵ带 Ȱ���ؼ� ������ ����
		//		int com =(int)(1+Math.random()*3);
		
		//2) Random() Ŭ������ nextInt, nextDouble..
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis());
		
		int count = 0;
		final int TRY_NUMBER = 10; //���
		boolean state = true; //���°� �������� ����(�ǵ帮�� �ʴ� �� ��� true)
		
		
		while(true) {
			count++; 
			if(count >TRY_NUMBER) {
				state = false; 
				break; //break�� if���ǹ��� ���� ���๮(when if�� ������ �ݺ���)
			}
			
			int com = 1+rand.nextInt(3);
			
			System.out.print("����(1), ����(2), ��(3) >>");
			int user = scan.nextInt();
			
			if(com == 1) 		System.out.println("��ǻ�� : ����");
			else if(com == 2) 	System.out.println("��ǻ�� : ����");
			else 				System.out.println("��ǻ�� : ��");
			
			int result = user-com;
			
			if(result==0)							System.out.println("���º�!");
			else if(result == -1 || result ==2)		System.out.println("��ǻ�� ��!");
			else {									
				System.out.println("����� ��!");
				break; // ����ڰ� �¸��ϸ� ���α׷� ����
			}
		}
		System.out.println("================");
		if(state) System.out.println("����� �¸�!");
		else  	  System.err.println("�õ�Ƚ�� �ʰ�!");
		
		scan.close();
	}
		
}
