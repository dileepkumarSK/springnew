package com.mvc.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name,adress;
	private int age;
	public String getName() {
		return name;
	}
	public String getAdress() {
		return adress;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
