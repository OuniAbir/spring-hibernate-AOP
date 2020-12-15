package com.training.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAsyncAspect {
	
	@Before("com.training.aopdemo.aspect.SharedAOPUtulities.forAllPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n========>  Log To Cloud Async  ");
	}
}
