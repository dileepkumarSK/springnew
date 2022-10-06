package com.smi.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smi.controller.EmployeeController;
import com.smi.vo.EmployeeVO;

public class EmpolyeeDeatilsRetriving {

	public static void main(String[] args) {

		ApplicationContext ap = new ClassPathXmlApplicationContext("com/smi/cfgs/applicationContext.xml");

		EmployeeController c = ap.getBean("cont", EmployeeController.class);
		List<EmployeeVO> l = c.Showdetails();

		for (EmployeeVO v : l) {
			System.out.println(v.getName());
			System.out.println(v.getId());
			System.out.println(v.getSal());
			System.out.println(v.getJob());
			System.out.println(v.getDeptno());
		}
		
		
	}

}
