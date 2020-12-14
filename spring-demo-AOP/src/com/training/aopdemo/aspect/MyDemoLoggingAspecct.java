package com.training.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspecct {

	// here we add all of our related advices for logging

	/*
	 * will match on the addAccount method in any class
	 * @Before("execution(public void addAccount())")
	 */

	/*
	 * only match on the addAccount method in AccountDAO class
	 * @Before("execution(public void com.training.aopdemo.dao.AccountDAO.addAccount())")
	 */

	/*
	 * will match on meth starts with "add"
	 * @Before("execution(public void add*())")
	 */

	/*
	 * will match on meth that starts with "add"
	 * @Before("execution(* add*())")
	 */

	// will match on any return type for meth that starts with "add"
	@Before("execution(* add*())")
	public void beforeaddAccountAdvice() {
		System.out.println("========> execution @Before advice befor the addAccount meth");
	}
}
