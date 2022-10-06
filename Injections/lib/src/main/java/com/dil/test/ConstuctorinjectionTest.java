package com.dil.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.dil.beans.Hellomessge;
import com.dil.beans.HellomessgeCI;

public class ConstuctorinjectionTest {

	public static void main(String[] args) {
		Resource res=new FileSystemResource("src/main/java/com/dil/cfgs/applicationContext.xml");
        BeanFactory fa=new XmlBeanFactory(res);
        HellomessgeCI h=(HellomessgeCI) ((Object) fa.getBean("forci"));
        h.wish("dileep");
        
        
	}

}
