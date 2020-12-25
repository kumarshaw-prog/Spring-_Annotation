package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("happyFortune")
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune Today is your lucky day!";
	}

}
