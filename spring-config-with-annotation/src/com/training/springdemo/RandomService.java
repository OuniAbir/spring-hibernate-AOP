package com.training.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return " RandomService : Today is ur lucky day !";
	}

}
