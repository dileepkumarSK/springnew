package com.facins.test;

import java.util.Date;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.facins.beans.Employee;

public class UsingViaFactmethodTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory fac = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader re = new XmlBeanDefinitionReader(fac);
		re.loadBeanDefinitions("com/facins/cfgs/applicationContext.xml");

		Employee d = fac.getBean("get", Employee.class);
		Employee m = fac.getBean("get", Employee.class);

		System.out.println(m.hashCode());

		System.out.println(d.hashCode());

		/*
		 * Class c1=fac.getBean("c1",Class.class);
		 * System.out.println("c1 obj class name"
		 * +c1.getClass().getName()+"  c1 obj data::"+c1.toString());
		 * 
		 */

	}

}
