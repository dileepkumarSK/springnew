package com.lok.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mv")
public class MovieStart {
	@Autowired
	private CastingLIst cl;

	public MovieStart() {
		System.out.println("MovieStart.MovieStart()");

	}

	public void details() {
		cl.Hero();
		cl.director();
		System.out.println(cl.toString());
	}

}
