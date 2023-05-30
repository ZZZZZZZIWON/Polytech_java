package miniproject_db;

public class Test {
	
	private String uname;
	private String email;
	
	public Test() {	super();}
	
	public Test(String uname, String email) {
		super(); // Object클래스의 생성자를 호출 -> upcasting 가능
		this.uname = uname;
		this.email = email;
	}

	public String getUname() { return uname; }
	public void setUname(String uname) {this.uname = uname;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	

	
	@Override
	public String toString() {
		return "Test [uname=" + uname + ", email=" + email + "]";
	}
}