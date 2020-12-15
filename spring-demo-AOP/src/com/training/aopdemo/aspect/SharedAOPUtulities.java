package com.training.aopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class SharedAOPUtulities {

	@Pointcut("execution(* com.training.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {
	};

	// create a pointcut for getter methods
	@Pointcut("execution(* com.training.aopdemo.dao.*.get*())")
	public void getter() {
	};

	// create pointcut for setter methods
	@Pointcut("execution(* com.training.aopdemo.dao.*.set*(*))")
	public void setter() {
	};

	// combine pointcut : all package meth.. exclude getter/setter
	@Pointcut(" forDaoPackage() && !(getter() || setter())")
	public void forAllPackageNoGetterSetter() {
	};
}
