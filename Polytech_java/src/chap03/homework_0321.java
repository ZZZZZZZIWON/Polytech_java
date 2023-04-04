package chap03;

import java.util.Scanner;

public class homework_0321 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("369Game Start");
		while (true) {
			System.out.print("Enter a number>> ");
			int num = scanner.nextInt();

			if (num < 1 || num > 99) {
				System.out.println("Error()");
				break;
			}
			if (num == 99) {
				System.out.println("CLAP CLAP");
				System.out.println("The End");
				break;
			}

			int clap = 0;
			int i = num;

			while (i > 0) {
				int rem = i % 10;
				if (rem == 3 || rem == 6 || rem == 9) {
					clap++;
				}
				i = i / 10;
			}

			if (clap == 1) {
				System.out.println("CLAP");
			} else if (clap == 2) {
				System.out.println("CLAP CLAP");

			}

		}
	}
}