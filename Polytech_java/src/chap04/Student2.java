package chap04;

public class Student2 {

	// 속성 (필드)
	private String name;
	private int age;
	private int id;
	
	// 행위 (메소드)
	// 1. 생성자 메소드
	
	public Student2() {
		System.out.println("학생입니다.");
	}

	public Student2(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}


	// 2. 일반 메소드
	void study() {
		System.out.println("공부합니다.");
	}
	
	// 다형성 : 오버로딩(overloading)
	void study(String test) {
		System.out.println(test + " 공부를 합니다.");
		
	}
	void eat() {
		System.out.println("먹습니다.");
	}

	void eat(String food) {
		System.out.println(food + "를 먹습니다.");
	}
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
	
	boolean test(String test, int score) {
		System.out.println(test + "시험을 봤어요");
		if (score >= 60) {
			return true;
		}
		else 
			return false;
	}
	
	// Getters & Setters(private한 필드를 불러오기)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 3. main 메소드
	public static void main(String[] args) {
		
		Student2 student = new Student2();  // 객체명 선언 + 공간 확보
		student.study();
		if(student.test("정보처리기사", 80)) {
			System.out.println("합격하셨습니다.");
		}
		else 
			System.out.println("불합격하셨습니다.");
		
		student.eat();
		student.eat("햄버거");
		
		student.sleep();
		
		
		
		
	}
}
