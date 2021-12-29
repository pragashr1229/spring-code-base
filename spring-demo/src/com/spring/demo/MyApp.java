package com.spring.demo;


public class MyApp {

	public static void main(String[] args) {

		// create the object
		Coach1 theCoach = new BaseballCoach();
		 Coach1 theCoach1 = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
		System.out.println(theCoach1.getDailyWorkout());		

	}

}
