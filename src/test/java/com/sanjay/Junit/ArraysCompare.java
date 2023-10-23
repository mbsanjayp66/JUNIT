package com.sanjay.Junit;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompare {

	@Test
	public void test() {
		int[] num = {3,2,21,55,4};
		int[] exp = {2,3,4,21,55};
		Arrays.sort(num);
		assertArrayEquals(exp, num);
	}
	
	@Test(expected = NullPointerException.class)
	public void testNPE() {
		Integer[] num = null;
		int[] exp = {2,3,4,21,55};
		Arrays.sort(num);
		//assertArrayEquals(exp, num);
	}
	
	@Test(timeout = 1)
	public void testForPerformance() {
		int[] arr = {12,34,56,666};
		for(int i=0;i<=10000000;i++) {
			arr[0] = i;
			Arrays.sort(arr);
		}
	}

}
