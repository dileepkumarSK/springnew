package com.prv.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.prv.beans.Msdhoni;

public class MsdTest {

	public static void main(String[] args) {

		DefaultListableBeanFactory fac = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader re = new XmlBeanDefinitionReader(fac);
		re.loadBeanDefinitions("com/prv/cfgs/applicationContext.xml");

		// objecte Created using Private Constructor
		Msdhoni m = fac.getBean("msd", Msdhoni.class);
		System.out.println("---------------------------");
		// objecte Created using Private Constructor parametrized
		Msdhoni x = fac.getBean("msdp", Msdhoni.class);
	}

}
