package com.sci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sci.beans.Addition;
import com.sci.beans.Division;
import com.sci.beans.Multiplication;
import com.sci.beans.Substraction;

public class Test {

	public static void main(String[] args) {
		Resource res = new FileSystemResource("src/main/java/com/sci/cfgs/applicationContext.xml");
		BeanFactory fc = new XmlBeanFactory(res);

		Addition a = (Addition) (Object) fc.getBean("add");
		System.out.println(a.method());
		System.out.println("...............................");

		Division d = (Division) (Object) fc.getBean("div");
		System.out.println(d.method());
		System.out.println("...............................");

		Multiplication m = (Multiplication) (Object) fc.getBean("mul");
		System.out.println(m.method());
		System.out.println("...............................");

		Substraction s = (Substraction) (Object) fc.getBean("add");
		System.out.println(s.method());
		System.out.println("...............................");

	}

}
