package com.training.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyAPIAnalyticsAspect {

	@Before("com.training.aopdemo.aspect.SharedAOPUtulities.forAllPackageNoGetterSetter()")
	public void performApiAnalytics() {
		System.out.println("\n========>  Perform Api Analytics ");
	}
}
