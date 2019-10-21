package kr.co.itcen.hellospring.controller;

public class User {
	private long no;
	private String email;
	private Integer age;
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [no=" + no + ", email=" + email + ", age=" + age + "]";
	}
	

}
