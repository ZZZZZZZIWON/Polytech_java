package miniproject;

public class User {
	String name;
	PayType payType;
	
	public User(String name, PayType payType) {
		super();
		this.name = name;
		this.payType = payType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", payType=" + payType + "]";
	}	
}
