package com.sanjay.Junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelperTest2 {

	StringHelper helper = new StringHelper();
	
	private String input;
	private String output;
	
	public StringHelperTest2(String input, String output) {
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]>testConditions(){
		String expectedResults[][] = {
				{"AACD","CD"},
				{"ACD","CD"}
		};
		return Arrays.asList(expectedResults);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		assertEquals(output,helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		assertEquals(output,helper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		//assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("AACD"));
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("AACD"));
	}
}
