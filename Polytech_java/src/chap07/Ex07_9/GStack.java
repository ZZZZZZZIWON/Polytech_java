package chap07.Ex07_9;

public class GStack<T> {
	int tos;
	Object[] stck; // stck�� � type�� �� �� ��

	public GStack() { // �����ڿ����� <T> ����
		tos = 0;
		stck = new Object[10]; // �ܼ��� ������ �Ҵ�(� data type���� �Һи�)
	}

	public void push(T item) { // �ܼ��� �ִ� method�ϱ� void class
		// ���� �� datatype �𸣱� ������ T�� ���ڷ� ����
		if (tos == 10) // �ִ밪
			return; // void����) method ��ü�� ����
		stck[tos] = item; // upcasting(item�� TŸ�� stck�� ObjectŸ��)
		tos++; // ������ ���� �غ�
	}

	public T pop() {// T���� ������ ���̱� ������ T
		if(tos==0)
			return null;
		tos--; // �ϳ��� �����Ա� ������ ����
			   // tos�� ���� ���̰� �� ���� tos�� �����;� ��
		return (T)stck[tos]; // downcasting
		// return (T)stck[--tos]; // ���� ���̱� ������ ����
	}
}
