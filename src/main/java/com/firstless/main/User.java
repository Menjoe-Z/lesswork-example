package com.firstless.main;

public class User {
	private String name;
	private String sex;
	private int age;
	private String password;
	public User(String name, String sex, int age, String password) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.password = password;
	}
	public User() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
