package com.lok.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lok.beans.MovieStart;

public class LookUpTest {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/lok/cfgs/applicationContext.xml");
		MovieStart mv=ap.getBean("mv",MovieStart.class);
		mv.details();
		System.out.println(mv);
		System.out.println("======================");
		MovieStart mv2=ap.getBean("mv",MovieStart.class);
		mv2.details();
		System.out.println(mv2);
		((AbstractApplicationContext) ap).close();
		
	}

}
