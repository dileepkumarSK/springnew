package com.aop.Dao;

import org.springframework.stereotype.Component;

@Component("calc")
public class Calculator {

	public int addition(int x)
	{
		System.out.println("Calculator.addition()");
		return x;
	}
	
	public void muldgd(int x)
	{
		System.out.println("Calculator.muldgd()");
	}
	
	
	public String throwingAfetr(boolean x)
	{
		System.out.println("Calculator.throwingAfetr() ++++++++>>>>>>...");
		
		if(x)
		{
			 throw new RuntimeException("i am throwing Exception");
		}
		
		return "success man move on";
		
	}
	
	
}
