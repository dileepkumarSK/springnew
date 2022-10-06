package com.nxml.beans;

import org.springframework.stereotype.Component;

@Component
public class Dtdc implements Courier {

	@Override
	public String Company() {
		
		return "DtDc";
	}

}
