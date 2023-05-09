package chap07.Ex07_9;

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); // T 타입에 String
		// 생성자에서는 <T> 생략
//		public GStack() { 
//			tos = 0;
//			stck = new Object[10]; // 단순히 공간만 할당(어떤 data type인지 불분명)
//		}

		stringStack.push("seoul");
		stringStack.push("daejeon");
		stringStack.push("busan");

		// iterator는 사용하려면 override하거나 새롭게 생성해야 함

		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop()); // busan daejeon seoul 끝에 넣은 busan이 제일 먼저 push
		}

		GStack<Integer> intStack = new GStack<Integer>();
		
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(intStack.pop()); // 5 -> 3 -> 1
		}
		
	}
}
