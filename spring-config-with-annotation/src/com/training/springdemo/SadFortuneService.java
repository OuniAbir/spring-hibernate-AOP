package com.training.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return ">> SadFortuneService : today is a sad day";
	}

}
