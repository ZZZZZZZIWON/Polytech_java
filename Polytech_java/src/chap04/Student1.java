package chap04;

public class Student1 {
	private String dept;
	private int id;

	public Student1() {} // ������ �����ڸ� ������ ������ �ڵ����� ����
						// �ϳ��� �����ڶ� ����� �������� �ʱ� ������ �������� ��

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
