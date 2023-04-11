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
		Person p = new Student("박지원");
		System.out.println(p.name);
		// System.out.println(p.grade); 실행 불가
		// System.out.println(p.depart); 실행 불가 
		Student s = new Student("박지원");
		s.grade = "A";
		s.depart = "스마트소프트웨어학과";
		System.out.println(s.grade);
		System.out.println(s.depart);
		System.out.println("--------------------");
		
		//Downcasting
		Student s2 = (Student)p;
		System.out.println(s2.name);
		s2.grade = "A";
		s2.depart = "스마트소프트웨어학과";
		System.out.println(s2.grade);
		System.out.println(s2.depart);
		
		if(p instanceof Person)
			System.out.println("Person");
		else
			System.out.println("NOT Person");
	}
}
