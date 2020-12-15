package com.training.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspecct {

	// here we add all of our related advices for logging

	/*
	 * will match on the addAccount method in any class
	 * 
	 * @Before("execution(public void addAccount())")
	 */

	/*
	 * only match on the addAccount method in AccountDAO class
	 * 
	 * @Before("execution(public void com.training.aopdemo.dao.AccountDAO.addAccount())"
	 * )
	 */

	/*
	 * will match on meth starts with "add"
	 * 
	 * @Before("execution(public void add*())")
	 */

	/*
	 * will match on meth that starts with "add"
	 * 
	 * @Before("execution(* add*())")
	 */

	/*
	 * will match on any return type for meth that starts with "add"
	 * 
	 * @Before("execution(* add*())")
	 */

	/*
	 * Make use of PointCut Declarations match on any meth on com.training.aopdemo
	 * package with any params
	 */
	
	@Pointcut("execution(* com.training.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {
	};

	@Before("forDaoPackage()")
	public void beforeaddAccountAdvice() {
		System.out.println("========> execution @Before advice befor the addAccount meth");
	}
	
	@Before("forDaoPackage()")
	public void performApiAnalytics() {
		System.out.println("========>  Perform Api Analytics ");
	}
	
}
