package com.junit.junit_demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

public class StringHelperTest1 {

	@Test 
	public void test() {
		StringHelper helper = new StringHelper();

		assertEquals("AA", helper.getfirst2Chars("AACD"));
	}

	@Test
	public void test2() {
		StringHelper helper = new StringHelper();
		assertEquals("AC", helper.getfirst2Chars("ACD"));
	}
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario() {
		StringHelper helper = new StringHelper();
		// assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenario() {
		StringHelper helper = new StringHelper();
		// assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
