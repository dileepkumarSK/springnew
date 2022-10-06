package com.collectio.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.collectio.beans.ListOfNamesArry;

public class Test {
	public static void main(String[] args) {

		Resource res = new ClassPathResource("com/collectio/cfg/applicationContext.xml");
		XmlBeanFactory fac = new XmlBeanFactory(res);
		ListOfNamesArry l = (ListOfNamesArry) (Object) fac.getBean("listm");
		l.show();

	}
}