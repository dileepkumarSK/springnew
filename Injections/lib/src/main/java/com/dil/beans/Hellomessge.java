package com.dil.beans;

import java.util.Date;

public class Hellomessge {

	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public void wish(String name) {
		System.out.println("hi hello "+date.toGMTString()+"  "+name);
	}
	
	
	
	
}
