package chap04;

public class MethodSample {

	// 메소드 오버로딩
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
		System.out.println(sample.getSum(1, 2)); // static이 아니라면 무조건 객체를 생성해야 함
		System.out.println(sample.getSum(1, 2, 3)); 
		System.out.println(sample.getSum(1.0, 2.0)); 
	
	}

}
