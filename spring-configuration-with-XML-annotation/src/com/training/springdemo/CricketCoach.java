package com.training.springdemo;

public class CricketCoach implements Coach {
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println(" CricketCoach : inside setter meth - setEmailAddress ");
		this.emailAddress = emailAddress;
		
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println(" CricketCoach : inside setter meth - setTeam ");
		this.team = team;
	}

	private FortuneService fortuneService;
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(" CricketCoach : inside setter meth - setFortuneService ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "prictice fast bowling for 15minn";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
