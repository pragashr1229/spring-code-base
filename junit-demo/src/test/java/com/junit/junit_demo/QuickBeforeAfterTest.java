package com.junit.junit_demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

class QuickBeforeAfterTest {

	StringHelper helper;

	@Before
	public void setup() {
		helper = new StringHelper();
	}

	@Test
	void test() {
		assertEquals("CD", helper.getfirst2Chars("ACD"));
	}

	@Test
	void test1() {
		System.out.println("test1 executed ");
	}
}
