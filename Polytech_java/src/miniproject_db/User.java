package miniproject_db;

public class User {
	int uid;
	String uname;
	PayType payType;
	
	public User(int uid, String uname, PayType payType) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.payType = payType;
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public PayType getPayType() {
		return payType;
	}
	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", payType=" + payType + "]";
	}
	
	
}
