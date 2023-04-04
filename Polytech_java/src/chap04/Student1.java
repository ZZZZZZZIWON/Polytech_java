package chap04;

public class Student1 {
	private String dept;
	private int id;

	public Student1() {} // 임의의 생성자를 만들지 않으면 자동으로 생성
						// 하나의 생성자라도 만들면 생성되지 않기 때문에 만들어줘야 함

	public Student1(String dept, int id) {
		this.dept = dept;
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student1\n[dept = " + dept + ", id = " + id + "]";
	}
	
	
}
