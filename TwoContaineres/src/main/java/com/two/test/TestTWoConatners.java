package com.two.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.two.beans.Vehicle;

public class TestTWoConatners {

	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/two/cfgs/applicationContext.xml");
		Vehicle v = ap.getBean(Vehicle.class);
		v.journey();
		Vehicle v1 = ap.getBean(Vehicle.class);
		v1.journey();
	}

}
