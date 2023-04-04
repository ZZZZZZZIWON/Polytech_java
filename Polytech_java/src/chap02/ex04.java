package chap02;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int med;
		
	    if(a>=b) {
	    	if(c>=a) 		med=a;
	    	else if(c>=b) 	med=c;
	    	else 			med=b;	
	    }
	    
	    if(b>=c) {
	    	if(a>=b) 		med=b;
	    	else if(a>=c) 	med=a;
	    	else 			med=c;	
	    }
	    
	    else    {
	    	if(b>=c) 		med=c;
	    	else if(b>=a) 	med=b;
	    	else 			med=a;	
	    }
		
		System.out.println("중간 값은 " +med);

		scan.close();

	}
}
