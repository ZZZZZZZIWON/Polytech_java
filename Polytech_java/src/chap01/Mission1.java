package chap01;

// �̼� 1: �־��� ���� �µ��� ȭ�� �µ��� �ٲٴ� CtoF �޼ҵ带 �ۼ��϶�.
// F = (9/5)*C + 32
// C : 15�� ��� ����

public class Mission1 {
	
	public static double CtoF(double c) {
		return (9./5.)*c + 32;

	}
	public static void main(String[] args) {
		double c = 14;
	
			System.out.println("ȭ���µ� : " +CtoF(c));
	}

}
