package chap04;

public class ClassRoom {
	// �Ӽ�
	Student2[] students = new Student2[21];
	int[] com = new int[21];

	// ����
	void setStudent() {
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student2("", 0, 0);
		}
	}

	void teach(String prof) {
		System.out.println(prof + "�������� �����մϴ�.");
	}

	void learn(Student2[] s) {
		for (Student2 student : students) {

		}
	}

	public static void main(String[] args) {

	}
}
