package com.training.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

//	create an array of things 
	private String[] data = {
			"DATA 1 ",
			"DATA 2",
			"DATA 3"
	};
	
//	create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the data array 
		int index = myRandom.nextInt(data.length);
		
		
		return data[index] ;
	}

}
