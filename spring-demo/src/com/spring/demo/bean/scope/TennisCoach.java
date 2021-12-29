package com.spring.demo.bean.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // A new bean instance is created each time the bean is requested from the IOC container
public class TennisCoach implements Coach {
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
