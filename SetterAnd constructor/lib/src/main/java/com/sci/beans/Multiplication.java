package com.sci.beans;

public class Multiplication {
	
	private int x,y;

	public Multiplication(int x, String h,int y) {
	
		this.x = x;
		this.y = y;
		System.out.println("Cheking with u r attributes");
	}
	
         public int method()
         {
        	 return x*y;
         }
	

}
