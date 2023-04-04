package chap04;

public class Book {
	// �ʵ� : ��� ����
	String title;
	String author; // ��� ����(��ü�� ������ ���� ����)
	String name = "������";
	
	// �޼ҵ�
	// ������ �޼ҵ�
	Book() {
		System.out.println(name);
	}
	Book(String title) {
		this();
		this.title = title;
		this.author = "�۰��̻�"; // String(�Ű�����) �ϳ��� �ʱ�ȭ
	}
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// �Ϲݸ޼ҵ�
	void printBook() {
		System.out.println(this.title + " : " + this.author);
	}
	
	
	public static void main(String[] args) {
		Book book = new Book();
		Book littlePrince = new Book("�����", "�������丮");
		Book loveStory = new Book("������");
		littlePrince.printBook();
		loveStory.printBook();
		book.title = "book_author";
		System.out.println(book.title);
	}
}
