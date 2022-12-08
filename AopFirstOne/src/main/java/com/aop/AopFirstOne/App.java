package com.aop.AopFirstOne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.Dao.AdditionCalDao;
import com.aop.Dao.Calculator;
import com.aop.cfg.ApplicationContext;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

		Calculator cal=context.getBean(Calculator.class);
		//cal.addition(3);
		
		try {
			cal.throwingAfetr(true);
		} catch (Exception e) {
			
		}
		
		
		//cal.muldgd(0);
//		AdditionCalDao addcal =context.getBean(AdditionCalDao.class);
//		addcal.addtwonumber();
		context.close();
	 }
}
