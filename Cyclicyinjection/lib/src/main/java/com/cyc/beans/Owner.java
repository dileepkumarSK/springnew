package com.cyc.beans;

public class Owner {
private Employee em;

public Owner(Employee em) {
	super();
	System.out.println("Owner.Owner()");
	this.em = em;
}

public void setown(Employee em) {
	System.out.println("owner class");
	
	this.em = em;
	System.out.println(em.getClass().getName());
}

}
