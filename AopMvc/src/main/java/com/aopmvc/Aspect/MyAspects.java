package com.aopmvc.Aspect;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspects {

	private Logger log=Logger.getLogger(getClass().getName());

	@Before("execution (* home(..) )")
	public void meth() {
		log.info("hello sucess man");
	}

}
