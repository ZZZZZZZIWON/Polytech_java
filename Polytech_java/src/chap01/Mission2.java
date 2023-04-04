package chap01;

// 정수형의 2개의 input parameter를 입력받은 후
// 더 큰 수를 return하는 max 메소드를 작성하라.

	public class Mission2 {
		public static int max(int x, int y) {
			if(x>y)
				return x;
			else
				return y;
		}

		public static void main(String[] args) {
			int x = 10;
			int y = 20;
			System.out.println("더 큰 수는 : " + max(x,y));
			

	}

}
