package chap06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#"); // ���� �߰�
		String b = new String(",C++"); // comma �߰�

 		System.out.println(a.length()); // a�� ������ �ִ� ������ ���� => [3]
 		System.out.println(a.contains("#")); // #�� ������ �ִ� �� üũ -> ������ true ��ȯ => [true]
 		System.out.println(a.concat(b)); // a+b�� ��ȯ => [ C#,C++]
 		System.out.println(a);
 		System.out.println(a.trim()); // ���� ���� => [C#]
 		
 		String c = a.concat(b);
 		System.out.println(c); // => [ C#,C++]
 		System.out.println(c.replace("C#", "java")); // C#�� java�� ��ü => [ java,C++]
	
 		String s[] = c.split(","); // comma�� �������� C#�� C++�� �迭�� ���� ��
 		for (String n : s) {
			System.out.println(n); // �迭�� �ִ� ���� �ϳ��� ��� => n = [ C#] , n = [C++]
		}
 		
 		String sub = c.substring(4);
 		System.out.println(sub); // comma���� ���ڿ��� ��ȯ => [C++]
 		
 		System.out.println(c.charAt(3)); // 3��° �ε����� ��ȯ => [,]
 		
 		
	}
}
