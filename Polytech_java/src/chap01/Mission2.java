package chap01;

// �������� 2���� input parameter�� �Է¹��� ��
// �� ū ���� return�ϴ� max �޼ҵ带 �ۼ��϶�.

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
			System.out.println("�� ū ���� : " + max(x,y));
			

	}

}
