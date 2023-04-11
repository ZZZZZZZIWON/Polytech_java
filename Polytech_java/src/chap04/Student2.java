package chap04;

public class Student2 {

	// �Ӽ� (�ʵ�)
	private String name;
	private int age;
	private int id;
	
	// ���� (�޼ҵ�)
	// 1. ������ �޼ҵ�
	
	public Student2() {
		System.out.println("�л��Դϴ�.");
	}

	public Student2(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}


	// 2. �Ϲ� �޼ҵ�
	void study() {
		System.out.println("�����մϴ�.");
	}
	
	// ������ : �����ε�(overloading)
	void study(String test) {
		System.out.println(test + " ���θ� �մϴ�.");
		
	}
	void eat() {
		System.out.println("�Խ��ϴ�.");
	}

	void eat(String food) {
		System.out.println(food + "�� �Խ��ϴ�.");
	}
	
	void sleep() {
		System.out.println("���� ��ϴ�.");
	}
	
	boolean test(String test, int score) {
		System.out.println(test + "������ �þ��");
		if (score >= 60) {
			return true;
		}
		else 
			return false;
	}
	
	// Getters & Setters(private�� �ʵ带 �ҷ�����)
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

	// 3. main �޼ҵ�
	public static void main(String[] args) {
		
		Student2 student = new Student2();  // ��ü�� ���� + ���� Ȯ��
		student.study();
		if(student.test("����ó�����", 80)) {
			System.out.println("�հ��ϼ̽��ϴ�.");
		}
		else 
			System.out.println("���հ��ϼ̽��ϴ�.");
		
		student.eat();
		student.eat("�ܹ���");
		
		student.sleep();
		
		
		
		
	}
}
