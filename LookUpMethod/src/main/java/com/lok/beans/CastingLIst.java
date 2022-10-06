package com.lok.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cast list")
@Scope("prototype")
@Lazy
public class CastingLIst {
	

	public CastingLIst() {
		System.out.println("CastingLIst.CastingLIst()");
	}

	public void Hero()
	{
		System.out.println("CastingLIst.Hero()");
	}
	public void director()
	{
		System.out.println("CastingLIst.director()");
	}
	
}
