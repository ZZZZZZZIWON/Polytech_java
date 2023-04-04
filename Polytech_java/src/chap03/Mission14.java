package chap03;

public class Mission14 {

	// makeArray 메소드 : int형 배열을 생성한 후 데이터를 넣어 리턴하는 메소드
	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
		return temp;

	}

	public static void main(String[] args) {
		int intArray[] = makeArray();
		for (int n : intArray) {
			System.out.print(n + " ");
		}
	}

}
