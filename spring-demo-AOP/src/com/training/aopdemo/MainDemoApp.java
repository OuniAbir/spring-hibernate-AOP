package com.training.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.aopdemo.dao.AccountDAO;
import com.training.aopdemo.dao.MemberShipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		MemberShipDAO theMemberShipDAO = context.getBean("memberShipDAO", MemberShipDAO.class);

		
		//call the business meth
		theAccountDAO.addAccount();
		theMemberShipDAO.addSillyMember();
		
		System.out.println("\n  ****** now call the setter/getter *******");
		// call the getter/setter
		theAccountDAO.getServiceName();
		theMemberShipDAO.getName();
		
		//close the context
		context.close(); 
	
	}

}
