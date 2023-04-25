package chap06;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer(10); // 박싱
		System.out.println(i);
		Integer i1 = 10; 			 // 오토박싱 
		System.out.println(i1);
		int n = i1;					 // 오토언박싱
		System.out.println(n); 		
		
		Integer i2 = new Integer("10");
		System.out.println(i2);
//		Integer i3 = "10";
		String i3 = "10";
		System.out.println(i3);
		
		char c1 = '4';
		char c2 = 'A';
		if(Character.isDigit(c1)){
			System.out.println("c1은 숫자");
			} // 안쪽의 값이 숫자인지 비교
		if(Character.isAlphabetic(c2)) {
			System.out.println("c2는 알파벳");
		}
		
		Double d = new Double("3.14");
	}

}
