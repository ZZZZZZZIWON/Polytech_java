package chap06;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer(10); // �ڽ�
		System.out.println(i);
		Integer i1 = 10; 			 // ����ڽ� 
		System.out.println(i1);
		int n = i1;					 // �����ڽ�
		System.out.println(n); 		
		
		Integer i2 = new Integer("10");
		System.out.println(i2);
//		Integer i3 = "10";
		String i3 = "10";
		System.out.println(i3);
		
		char c1 = '4';
		char c2 = 'A';
		if(Character.isDigit(c1)){
			System.out.println("c1�� ����");
			} // ������ ���� �������� ��
		if(Character.isAlphabetic(c2)) {
			System.out.println("c2�� ���ĺ�");
		}
		
		Double d = new Double("3.14");
	}

}
