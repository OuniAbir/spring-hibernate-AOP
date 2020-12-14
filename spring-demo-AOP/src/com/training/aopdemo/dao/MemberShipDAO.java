package com.training.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {
	
	public void addSillyMember()
	{
		System.out.println(getClass() + " : ADDING MY ACCOUNT");
		
	}
}
