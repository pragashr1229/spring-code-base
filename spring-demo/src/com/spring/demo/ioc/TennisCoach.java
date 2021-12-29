package com.spring.demo.ioc;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
