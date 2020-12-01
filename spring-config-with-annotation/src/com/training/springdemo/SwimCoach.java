package com.training.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return ">> SwimCoach : swim 1000 meters ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
