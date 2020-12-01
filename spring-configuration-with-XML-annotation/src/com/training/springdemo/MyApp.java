package com.training.springdemo;

public class MyApp {

	public static void main(String[] args) {

//		create the coach object 
		Coach theCoach = new TrackCoach(null);
		System.out.println(theCoach.getDailyWorkout());
	}

}
