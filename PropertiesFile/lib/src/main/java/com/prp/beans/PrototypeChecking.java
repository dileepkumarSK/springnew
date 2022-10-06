package com.prp.beans;

public class PrototypeChecking {

	private static int x=0;

	public PrototypeChecking() {
		System.out.println("PrototypeChecking.PrototypeChecking()----"+(++x));
	}
	
}
