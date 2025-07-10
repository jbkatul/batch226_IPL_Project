package com.tka.feb10;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestCalci {

	
	@Before
	public void beforeTest() {
		System.out.println("This is Before Test");
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		int expected_res = 25;
		int expected_res1 = 15;
		assertEquals(expected_res, Calculator.addTwo(20, 5));
		assertEquals(expected_res1, Calculator.subTwo(20, 5));	
	
	}
	@After
	public void afterTest() {
		System.out.println("This is after Test");
	}
	

}
