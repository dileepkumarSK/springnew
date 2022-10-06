package com.prv.beans;

public class Msdhoni {

	private Msdhoni() {
		super();
		System.out.println("Msdhoni.Msdhoni()---------//private");
	}

	private Msdhoni(String h) {
		super();
		System.out.println("Msdhoni.Msdhoni()---------//private" + h + ".........parameterixzed");
	}

}
