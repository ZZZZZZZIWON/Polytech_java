package chap04;

public class Book {
	// 필드 : 멤버 변수
	String title;
	String author; // 멤버 변수(객체를 만들어야 접근 가능)
	String name = "박지원";
	
	// 메소드
	// 생성자 메소드
	Book() {
		System.out.println(name);
	}
	Book(String title) {
		this();
		this.title = title;
		this.author = "작가미상"; // String(매개변수) 하나로 초기화
	}
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// 일반메소드
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	
	public static void main(String[] args) {
		Book book = new Book();
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		Book loveStory = new Book("춘향전");
		littlePrince.printBook();
		loveStory.printBook();
		book.title = "book_author";
		System.out.println(book.title);
	}
}
