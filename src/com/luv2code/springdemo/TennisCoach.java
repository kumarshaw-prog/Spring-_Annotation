package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}*/
	
	@PostConstruct
	public void postConstructor() {
		System.out.println("post bean creation");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("pre destroy beans");
	}
	
	@Qualifier("happyFortune")
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		
	this.fortuneService = fortuneService;
	
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
   
}
