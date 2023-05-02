package chap07;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public void printVector(Vector <Integer> v) {
		for (Integer i : v) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
//		Vector<Integer> v = new Vector<>();
		Vector<Integer> v = new Vector<Integer>();
		// VectorExŬ������ �ִ� printVector�޼ҵ带 ȣ���Ϸ��� ��ü�� ���� �Ŀ� ����
		VectorEx ex = new VectorEx();
		
		// int���� �����Ͱ� Integer�� �ڵ��ڽ̵Ǹ鼭 ����
		v.add(5);	
		v.add(4); 
		v.add(-1);
		v.add(6);
		
//		v.add(new Integer(6)); ���� �� �ʿ� ����
		
		// ���ϴ� �߰� ��ġ�� ���� ����(index 2�� �ڸ��� 7 ����)
		v.add(2, 7); 
		
		System.out.println("���� ��ü�� ��� ���� : " + v.size());
		System.out.println("���� ���� ��� : " + v.capacity());
		
//		for (int i = 0; i < v.size(); i++) {
//			System.out.println("��� : " + v.get(i));
//		}
//		
//		// ������ ��� ��Ҹ� �����ϴ� �迭 ����
//		Object[] vArray = v.toArray();
//		for (Object vv : vArray) {
//			System.out.print(vv + " ");
//		}
//		
//		System.out.println();
//		
//		// v ��ü�� �����ͼ� �� ���� ��ü�� �ϳ��� ������
//		for(Integer i : v) System.out.println(i);
		
		// v ��ü�� �����ͼ� �� ���� ��ü�� �� ���ϱ�
		int sum=0;
		for(Integer i : v) 
			sum+= i;
			System.out.println("sum : " + sum);
		
		// printVector�޼ҵ� ȣ��
		ex.printVector(v); // �Ķ���ͷ� Vector<Integer>Ÿ���� ����(v)
		
		

		
	}

}
