package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    
	@Value("${foo.email}")
	private String email;
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;
	private FortuneService fortuneService;

	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}




