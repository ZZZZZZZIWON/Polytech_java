package chap03;

import java.util.Scanner;

public class chap03_Mission10 {
	public static void main(String[] args) {

		char alB = 'A';
		char alB2 = 'a';
		int count = 0;
		do {
			System.out.print(alB);
			alB = (char)(alB+1);
			System.out.print(alB2);
			alB2 = (char)(alB2+1);
			count++;
			
			if(count%13==0)
				System.out.println();
		}
		while(alB<='Z');
		
		
		
	}
}

