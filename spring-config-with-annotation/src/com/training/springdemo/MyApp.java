package com.training.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		//create a spring container / load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
//		Coach theCoach = context.getBean("ThatCoach", Coach.class);
//		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		//call the meth on the bean 
//		System.out.println(theCoach.getDailyWorkout());
//	System.out.println(theCoach.getDailyFortune());
 
		// close the context 
		context.close();
	}

}
