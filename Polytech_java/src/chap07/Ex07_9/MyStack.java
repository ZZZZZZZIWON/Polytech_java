package chap07.Ex07_9;

public class MyStack {
	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>(); // T Ÿ�Կ� String
		// �����ڿ����� <T> ����
//		public GStack() { 
//			tos = 0;
//			stck = new Object[10]; // �ܼ��� ������ �Ҵ�(� data type���� �Һи�)
//		}

		stringStack.push("seoul");
		stringStack.push("daejeon");
		stringStack.push("busan");

		// iterator�� ����Ϸ��� override�ϰų� ���Ӱ� �����ؾ� ��

		for (int i = 0; i < 3; i++) {
			System.out.println(stringStack.pop()); // busan daejeon seoul ���� ���� busan�� ���� ���� push
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
