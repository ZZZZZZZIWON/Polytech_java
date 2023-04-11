package chap04;

public class MethodSample {

	// �޼ҵ� �����ε�
	int getSum(int x, int y) {
		return x + y;
	}
	
	int getSum(int x, int y, int z) {
		return x + y + z;
	}
	
	double getSum(double x, double y) {
		return (double)(x + y);
	}
	
	// double getSum(int x, int y) {
	// return (double) x + y; } 
 	
	
	public static void main(String[] args) {
		 MethodSample sample = new MethodSample();
		System.out.println(sample.getSum(1, 2)); // static�� �ƴ϶�� ������ ��ü�� �����ؾ� ��
		System.out.println(sample.getSum(1, 2, 3)); 
		System.out.println(sample.getSum(1.0, 2.0)); 
	
	}

}
