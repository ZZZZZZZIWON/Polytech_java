package chap07.Ex07_7;

public class Student3 {
	private int id;
	private String tel;
	// getter setter�� ����
	
	public Student3(int id, String tel) {
		super();
		this.id = id;
		this.tel = tel;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "���̵�:" + id + ", ��ȭ:" + tel;
	}
	
}
