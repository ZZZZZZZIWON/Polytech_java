package chap07;

import java.util.ArrayList;

public class ClassMate {
	String className;
	static ArrayList<Student> al = new ArrayList<Student>(); // List�ε� Index�� �ٿ��� Array���·� ����(Ȱ���� �޼ҵ尡 ����)
	
	public static void main(String[] args) {
		Student s1 = new Student("������", 1);
		al.add(s1); // al�̶�� �ڷᱸ�����ٰ� ���� ����
		s1 = new Student("������", 2);
		al.add(s1);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(0).getName()); // �޼��� chaining [al.get(0).getName()]�� String => String class�� �ִ� ���� �޼ҵ� Ȱ�� ����
		System.out.println(al.get(0).getId());
	}
	
}

class Student {
	private String name;

	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
}

