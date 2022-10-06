package com.dil.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.dil.beans.Hellomessge;

public class Setinjectiontest {

	public static void main(String[] args) {
		Resource res=new FileSystemResource("src/main/java/com/dil/cfgs/applicationContext.xml");
        BeanFactory fa=new XmlBeanFactory(res);
        Hellomessge h=(Hellomessge) ((Object) fa.getBean("maincl"));
        h.wish("dileep");
        
        
	}

}
