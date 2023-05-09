package chap07.Ex07_9;

public class GStack<T> {
	int tos;
	Object[] stck; // stck에 어떤 type이 들어갈 지 모름

	public GStack() { // 생성자에서는 <T> 생략
		tos = 0;
		stck = new Object[10]; // 단순히 공간만 할당(어떤 data type인지 불분명)
	}

	public void push(T item) { // 단순히 넣는 method니까 void class
		// 아직 들어갈 datatype 모르기 때문에 T를 인자로 전달
		if (tos == 10) // 최대값
			return; // void지만) method 자체가 종료
		stck[tos] = item; // upcasting(item은 T타입 stck은 Object타입)
		tos++; // 다음에 넣을 준비
	}

	public T pop() {// T에서 가져올 것이기 때문에 T
		if(tos==0)
			return null;
		tos--; // 하나를 꺼내왔기 때문에 감소
			   // tos를 먼저 줄이고 그 다음 tos를 가져와야 함
		return (T)stck[tos]; // downcasting
		// return (T)stck[--tos]; // 먼저 줄이기 때문에 가능
	}
}
