package chap02;

public class Mission1 {
	public static void main(String[] args) {
		boolean result; 
		result = 3==5;
	
		System.out.println(result);

		System.out.println("===============");
		
		int a= (int) 3.5;//3.5는 double인데 강제로 int로 변환할 때 앞에 (int)를 붙여줌0
		
		int plain = 10;
		int key = 8;
		int cyper = plain ^ key;
		System.out.println("cyper = " + cyper);
		System.out.println("plain = " + (cyper^key));
		
		System.out.println("===============");
		
		System.out.println(10>>1);
		System.out.println(10<<1);
	
		System.out.println("===============");
		
		var v = 30;
		System.out.println(v);
		
		
	}
}
