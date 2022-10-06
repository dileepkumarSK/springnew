package com.sta.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.sta.bean.FlipKart;

public class FlipKartTest {

	public static void main(String[] args) {
		Resource res=new FileSystemResource("src/main/java/com/sta/cfgs/applicationContext.xml");
		XmlBeanFactory fact=new XmlBeanFactory(res);
		FlipKart fp=(FlipKart)(Object)fact.getBean("flipkart");
		fp.show();
	}
	
}
