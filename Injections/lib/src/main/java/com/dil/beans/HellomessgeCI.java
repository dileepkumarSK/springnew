package com.dil.beans;

import java.util.Date;

public class HellomessgeCI {

	private Date date;

	

	public HellomessgeCI(Date date) {
		
		this.date = date;
	}



	public void wish(String name) {
		System.out.println("hi hello "+date.toGMTString()+"  "+name);
	}
	
	
	
	
}
