package com.nxml.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Grocery implements Amazon {
	private Courier c;

	public Grocery(Courier c) {
		super();
		this.c = c;
	}

	public void Delivery() {
		System.out.println(c);
		System.out.println("grocery  will Delivary From " + c.Company());

	}

}
