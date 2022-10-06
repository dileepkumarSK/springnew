package com.nxml.beans;

import org.springframework.stereotype.Component;

@Component
public class Moblies implements Amazon {
 
    private Courier c;	
	public Moblies(Courier c) {
		
		this.c = c;
	}
	public void Delivery() {
		System.out.println("Moblie  will Delivary From "+c.Company());

	}

}
