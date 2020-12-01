package com.training.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

//@Component("ThatCoach")
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService ;
	
	public TennisCoach() {
		System.out.println("TennisCoach :  inside TennisCoach constructor");
	}
	
	
	
	@PostConstruct
	public void DoMyStartStuff() {
	System.out.println("TennisCoach :  inside DoMyStartStuff ");
	}
	
	
	@PreDestroy
	public void DoMyCleanStuff() {
	System.out.println("TennisCoach :  inside DoMyCleanStuff ");
	}
/*	
	  @Autowired
	    public TennisCoach(@Qualifier("randomFortuneService") FortuneService theFortuneService) {
	        System.out.println(">> TennisCoach: inside constructor using @autowired and @qualifier");
	        
	        fortuneService = theFortuneService;
	    }
*/
/*
	@Autowired
	public void AnyMethode(FortuneService fortuneService) {
		System.out.println("TennisCoach :  inside AnyMethode");
		this.fortuneService = fortuneService;
	}
*/
/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("TennisCoach :  inside setFortuneService");
		this.fortuneService = fortuneService;
	}
*/
/*	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
