package com.training.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-1)
public class MyDemoLoggingAspecct {

	@Before("com.training.aopdemo.aspect.SharedAOPUtulities.forAllPackageNoGetterSetter()")
	public void beforeaddAccountAdvice(JoinPoint theJoinPoint) {
		System.out.println("\n========> befor the addAccount meth");
		
		// display the meth argument 
		MethodSignature methodSig = (MethodSignature) theJoinPoint.getSignature()  ;
		System.out.println("Method : "  + methodSig );
		
		// display meth arguments 
		//get args 
		Object[] args = theJoinPoint.getArgs();
		 for (Object arg: args) {
			System.out.println(arg);
		}
		
	}

}
