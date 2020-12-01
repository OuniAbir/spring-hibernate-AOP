package com.training.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//create a spring container / load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCoach", CricketCoach.class);
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
//		let's call our new meth for fourtune 
		System.out.println(theCoach.getDailyFortune()); 
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());

		//close the context 
		context.close();
	}

}
