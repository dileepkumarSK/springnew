package com.aop.Aspects;

import java.lang.System.Logger;

import org.aspectj.apache.bcel.classfile.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectsOfMain {

//	@Before("execution (public void addition())")
//	public void beforeAspect()
//	{
//		System.out.println("AspectsOfMain.beforeAspect()");
//	}

	@Pointcut("execution ( * add*(..))")
	private void pointcutmeth() {

	}

	@Pointcut("execution (*  mul*(..))")
	private void multiplcation() {
	}

	@Pointcut(" pointcutmeth()&& multiplcation() ")
	private void both() {

	}

	// @Before("both()")

	/*
	 * @Before(" pointcutmeth()") public void beforeAspect(JoinPoint thejoin) {
	 * System.out.println("AspectsOfMain.beforeAspect()"); Object[] i =
	 * thejoin.getArgs();
	 * 
	 * int x = (int) i[0]; System.out.println(x); }
	 */

	/*
	 * @AfterReturning(pointcut = "execution( *  add*(*) )", returning = "result")
	 * public void afterreturningmethod(JoinPoint join, int result) {
	 * 
	 * System.out.println(((MethodSignature) join.getSignature()).toShortString());
	 * System.out.println("AspectsOfMain.afterreturningmethod()" + result);
	 * 
	 * }
	 */

	// @AfterThrowing is for Exception

	@AfterThrowing(pointcut = "execution (* throw*(..))", throwing = "t")
	public void methodafterthrowingman(JoinPoint joinPoint, Throwable t) {
		System.out.println(((MethodSignature) joinPoint.getSignature()).toShortString());

		System.out.println(t.toString());
		Object result = null;
        
		
	
		
		

	}

	/*
	 * @AfterThrowing(pointcut = "execution (* throw*(..))", throwing = "t") public
	 * void methodafterthrowingmanwithprocce(ProceedingJoinPoint joinPoint,
	 * Throwable t) { System.out.println(((MethodSignature)
	 * joinPoint.getSignature()).toShortString());
	 * 
	 * System.out.println(t.toString());
	 * 
	 * }
	 */

	/*
	 * @Around("execution (* throw*(..))") public void around(ProceedingJoinPoint
	 * joinPoint) { Object result = null; System.out.println("hi"); try { result =
	 * joinPoint.proceed(); } catch (Throwable e) {
	 * 
	 * } System.out.println("hello" + result); }
	 */

}
