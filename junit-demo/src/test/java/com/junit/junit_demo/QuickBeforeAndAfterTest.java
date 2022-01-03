package com.junit.junit_demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuickBeforeAndAfterTest {


	@BeforeEach
	public void before() {
		System.out.println("@Before");
	}

	@Test
	public void test() {
		System.out.println("@Test - test");
	}
	
	@Test
	public void test1() {
		System.out.println("@Test - test1");
	}

	@AfterEach
	public void after() {
		System.out.println("@After");
	}

	
}
