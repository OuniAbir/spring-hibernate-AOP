package com.training.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(-1)
public class MyDemoLoggingAspecct {

	@Before("com.training.aopdemo.aspect.SharedAOPUtulities.forAllPackageNoGetterSetter()")
	public void beforeaddAccountAdvice() {
		System.out.println("\n========> befor the addAccount meth");
	}

}
