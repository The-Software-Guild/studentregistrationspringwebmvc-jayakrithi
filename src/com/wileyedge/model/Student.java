package com.wileyedge.model;

public class Student {

	private String name;
	private String age;
	private String mobileno;
	private String address;
	
	public Student() {}
	
	public Student(String name, String age, String mobileno, String address) {
		super();
		this.name = name;
		this.age = age;
		this.mobileno = mobileno;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
