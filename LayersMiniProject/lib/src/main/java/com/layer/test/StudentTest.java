package com.layer.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.google.protobuf.TextFormat.Parser;
import com.layer.controller.StudentController;
import com.layer.vo.StudentVO;

public class StudentTest {

	public static void main(String[] args) {

		Resource res = new FileSystemResource("src/main/java/com/layer/cfgs/applicationContext.xml");
		BeanFactory fac = new XmlBeanFactory(res);
		StudentController s = (StudentController) (Object) fac.getBean("controller", StudentController.class);
		StudentVO vo = new StudentVO();
             vo.setId(12);
             vo.setM1(99);
             vo.setM2(99);
             vo.setM3(99);
             vo.setName("dileep");
             
             
		// // Scanner sc=new Scanner("System.in");
//		
//		System.out.println("ENter the ID");
//	//	vo.setId((int)Integer.parseInt(sc.next()));
//		
//		System.out.println("ENter the NAme");
//		vo.setName(sc.next());
//		System.out.println("ENter the m1 Marks");
//		vo.setM1((int)Integer.parseInt(sc.next()));
//		System.out.println("ENter the m2 marks");
//		vo.setM2((int)Integer.parseInt(sc.next()));
//		System.out.println("ENter the m3 marks");
//		vo.setM3((int)Integer.parseInt(sc.next()));

		try {
			System.out.println(s.proccessData(vo));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
