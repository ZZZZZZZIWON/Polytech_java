package chap04;

public class Ex {
	
	public static void main(String[] args) {
	
		Student1 student = new Student1(); // Student1의 기본생성자를 씀
		student.setDept("스마트소프트웨어학과");
		student.setId(23403);
		System.out.println(student.toString());
	}

}
