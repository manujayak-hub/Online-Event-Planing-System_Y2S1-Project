package conCustomer;

public class Customer {

	private int cusId;
	private String name;
	private String surName;
	private String email;
	private String passWord;
	
	public Customer(int cusId, String name, String surName, String email, String passWord) {
		
		this.cusId = cusId;
		this.name = name;
		this.surName = surName;
		this.email = email;
		this.passWord = passWord;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
}
