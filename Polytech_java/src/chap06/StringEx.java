package chap06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#"); // 공백 추가
		String b = new String(",C++"); // comma 추가

 		System.out.println(a.length()); // a가 가지고 있는 문자의 갯수 => [3]
 		System.out.println(a.contains("#")); // #을 가지고 있는 지 체크 -> 있으면 true 반환 => [true]
 		System.out.println(a.concat(b)); // a+b를 반환 => [ C#,C++]
 		System.out.println(a);
 		System.out.println(a.trim()); // 공백 제거 => [C#]
 		
 		String c = a.concat(b);
 		System.out.println(c); // => [ C#,C++]
 		System.out.println(c.replace("C#", "java")); // C#을 java로 교체 => [ java,C++]
	
 		String s[] = c.split(","); // comma를 기준으로 C#과 C++이 배열에 각자 들어감
 		for (String n : s) {
			System.out.println(n); // 배열에 있는 값을 하나씩 출력 => n = [ C#] , n = [C++]
		}
 		
 		String sub = c.substring(4);
 		System.out.println(sub); // comma뒤의 문자열만 반환 => [C++]
 		
 		System.out.println(c.charAt(3)); // 3번째 인덱스값 반환 => [,]
 		
 		
	}
}
