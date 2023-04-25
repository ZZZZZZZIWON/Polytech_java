package chap07;

import java.util.ArrayList;

public class ClassMate {
	String className;
	static ArrayList<Student> al = new ArrayList<Student>(); // List인데 Index를 붙여서 Array형태로 저장(활용할 메소드가 많음)
	
	public static void main(String[] args) {
		Student s1 = new Student("이유진", 1);
		al.add(s1); // al이라는 자료구조에다가 정보 저장
		s1 = new Student("엄남경", 2);
		al.add(s1);
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(0).getName()); // 메서드 chaining [al.get(0).getName()]는 String => String class에 있는 여러 메소드 활용 가능
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

