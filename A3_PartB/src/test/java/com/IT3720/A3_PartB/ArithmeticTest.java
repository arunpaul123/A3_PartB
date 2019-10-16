package com.IT3720.A3_PartB;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmeticTest {
	private Arithmetic testObj;
	private int a, b, expected, actual;
	
	@Before
	public void setUp() throws Exception {
		a = 10;
		b = 25;
		testObj = new Arithmetic(a, b);
	}

	@Test
	public void testAdd() {
		expected = a+b;
		actual = testObj.add(a, b);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		expected = a-b;
		actual = testObj.subtract(a, b);
		assertEquals(expected, actual);
	}
	
	@After
	public void tearDown() throws Exception {
		testObj = null;
	}

	

}
