package chap05;

class Person {
	String name;
	int id;

	public Person(String name) {
		this.name = name;
	}

}

class Student extends Person {
	String grade;
	String depart;

	public Student(String name) {
		super(name);
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		//Upcasting
		Person p = new Student("������");
		System.out.println(p.name);
		// System.out.println(p.grade); ���� �Ұ�
		// System.out.println(p.depart); ���� �Ұ� 
		Student s = new Student("������");
		s.grade = "A";
		s.depart = "����Ʈ����Ʈ�����а�";
		System.out.println(s.grade);
		System.out.println(s.depart);
		System.out.println("--------------------");
		
		//Downcasting
		Student s2 = (Student)p;
		System.out.println(s2.name);
		s2.grade = "A";
		s2.depart = "����Ʈ����Ʈ�����а�";
		System.out.println(s2.grade);
		System.out.println(s2.depart);
		
		if(p instanceof Person)
			System.out.println("Person");
		else
			System.out.println("NOT Person");
	}
}
