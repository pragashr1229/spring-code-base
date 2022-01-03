package com.junit.junit_demo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {
    
	@Test // The Test annotation tells JUnit that the 
	  //public void method to which it is attached 
	  //can be run as a test case.
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }
}
