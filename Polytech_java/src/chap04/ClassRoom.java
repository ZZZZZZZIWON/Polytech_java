package chap04;

public class ClassRoom {
	// 속성
	Student2[] students = new Student2[21];
	int[] com = new int[21];

	// 행위
	void setStudent() {
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student2("", 0, 0);
		}
	}

	void teach(String prof) {
		System.out.println(prof + "교수님이 수업합니다.");
	}

	void learn(Student2[] s) {
		for (Student2 student : students) {

		}
	}

	public static void main(String[] args) {

	}
}
