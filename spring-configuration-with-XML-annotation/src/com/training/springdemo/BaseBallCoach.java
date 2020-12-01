package com.training.springdemo;

public class BaseBallCoach implements Coach {
//		define a private field for dependency 
	private FortuneService fortuneService;
//	define constructor for dependency injection 
	public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "spend 30 min on batting practice ";
	}
	@Override
	public String getDailyFortune() {
//		use my fortuneService to get a fortune 
		return fortuneService.getFortune();
	}
}
