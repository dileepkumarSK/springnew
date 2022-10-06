package com.prp.beans;

public class Mydetails {

	private String name,age,gender,college;

	public Mydetails(String name, String age, String gender, String college) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Mydetails [name=" + name + ", age=" + age + ", gender=" + gender + ", college=" + college + "]";
	}
	
}
