package com.training.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppJavaConfigDemo {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		
		//call the meth on the bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
 
		// close the context 
		context.close();
	}

}
