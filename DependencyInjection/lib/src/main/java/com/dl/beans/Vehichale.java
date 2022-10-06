package com.dl.beans;

import javax.sql.rowset.spi.XmlReader;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Vehichale {

	

	public Vehichale() {
		super();
		System.out.println("Vehichale.Vehichale() Constructor");
	}
	public void music()
	{
		System.out.println("Vehichale.music()");
	}
	
	public void horn()
	{
		System.out.println("Vehichale.horn()");
	}
	
	public void lights()
	{
		System.out.println("Vehichale.lights()");
	}
	
	public void start()
	{
		DefaultListableBeanFactory fac=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader re=new XmlBeanDefinitionReader(fac);
		
		
		re.loadBeanDefinitions("com/dl/cfgs/applicationContext.xml");
		
		Engine e=fac.getBean(Engine.class);
		e.details();
		
		
		
		
	}

	
}
