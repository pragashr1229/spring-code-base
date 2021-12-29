package com.spring.demo.ioc;

import org.springframework.stereotype.Component;

// @Component- default bean id : the class name,make first letter as small letter
@Component
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your foot work";
	}

}