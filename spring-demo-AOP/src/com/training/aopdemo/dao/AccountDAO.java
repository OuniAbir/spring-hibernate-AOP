package com.training.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceName;
	
	public String getName() {
		System.err.println(getClass() + "in getName ");
		return name;
	}

	public void setName(String name) {
		System.err.println(getClass() + "in setName ");
		this.name = name;
	}

	public String getServiceName() {
		System.err.println(getClass() + "in getServiceName ");
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		System.err.println(getClass() + "in setServiceName ");
		this.serviceName = serviceName;
	}

	public void addAccount()
	{
		System.out.println(getClass() + " \n : ADDING MY ACCOUNT");
		
	}
	
	
}
