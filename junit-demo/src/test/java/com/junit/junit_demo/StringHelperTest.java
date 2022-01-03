package com.junit.junit_demo;

import static org.junit.Assert.*;
import org.junit.platform.runner.JUnitPlatform;


import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class StringHelperTest {

	@Test
	public void test() {
		//fail("Not yet implemented"); // When writing unit tests, we can use fail to explicitly 
									 // create a failure under desired testing conditions.
		
		 int result = (int) Math.random();
		 System.out.println(result);
		    if(result <= 0) {
		        fail("Result cannot exceed integer max value");
		    }
	}

}
