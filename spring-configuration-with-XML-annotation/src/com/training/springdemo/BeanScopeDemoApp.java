package com.training.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//create a spring container / load the spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
				//Retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				
				
//				Coach alphaCoach = context.getBean("myCoach", Coach.class);
////				check if they are pointing to the same object
//				boolean result = (theCoach == alphaCoach);
//				System.out.println(result);
//				System.out.println("\n Memory location : "+ theCoach );
//				System.out.println("\n Memory location : "+ alphaCoach );
			
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				

				//close the context 
				context.close();
		
		
	}

}
