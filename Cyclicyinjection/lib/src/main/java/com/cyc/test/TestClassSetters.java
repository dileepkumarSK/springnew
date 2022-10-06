package com.cyc.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.cyc.beans.Employee;

public class TestClassSetters {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("com/cyc/cfg/applicationContext.xml");
		XmlBeanFactory fac=new XmlBeanFactory(res);
		Employee e=(Employee)(Object)fac.getBean("empm");
		// we will get exception because two classes have @param construters so we will get
		

	}

}
