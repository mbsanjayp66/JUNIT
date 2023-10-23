package com.sanjay.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		//assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("AACD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("AACD"));
	}
}
