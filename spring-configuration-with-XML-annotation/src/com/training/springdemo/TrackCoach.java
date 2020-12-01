package com.training.springdemo;

public class TrackCoach implements Coach {
//	define a private field for dependency 
	private FortuneService fortuneService;

//define constructor for dependency injection 
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}
	@Override
	public String getDailyFortune() {
		return "Just do it" + fortuneService.getFortune();
	}
	public void doMyStartUpStuff() {
		System.out.println("TrackCoach : excute doMyStartUpStuff ");		
	}
	public void doMyCleaningUpStuff() {
		System.out.println("TrackCoach : excute doMyCleaningUpStuff ");		
	}
}
