package chap03;

public class Mission4 {

	public static void main(String[] args) {
		
		//1. 1~100������ ���� �� 13�� ����� �ջ��϶�.		
		int sum = 0;
		for(int num=1; num<=100; num++)
			if(num%13==0)  sum += num;
		
		System.out.println("sum = "+ sum);
		
		//2. 1~100������ ���� �� 13�� �Ǳ� �������� �ջ��϶�.
		sum =0;
		for(int num=1; num<=100; num++) {
			if(num%13==0) break;
			sum +=num;
			}
		System.out.println("sum = "+ sum);
			
		//3. 1~100������ ���� �� 13�� ����� ������ ���ڸ� �ջ��϶�.
		sum =0;
		for(int num=1; num<=100; num++) {
			 	if(num%13==0) continue;
				sum +=num;
				}
		System.out.println("sum = "+ sum);
		}
		
	}
	


