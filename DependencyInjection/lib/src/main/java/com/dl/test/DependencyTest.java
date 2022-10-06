package com.dl.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.dl.beans.Vehichale;

public class DependencyTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory fac=new DefaultListableBeanFactory();
		//conatiner created 
		
		XmlBeanDefinitionReader re=new XmlBeanDefinitionReader(fac);
		//reder it will act as a resource
		
		re.loadBeanDefinitions("com/dl/cfgs/applicationContext.xml");
		
		Vehichale v=fac.getBean("veh",Vehichale.class);
		v.horn();
		v.start();
		
	}

}
