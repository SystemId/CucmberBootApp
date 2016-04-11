package net.xeric.demos.services;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeralServiceTest {
	
	NumeralService numeralService = new NumeralService();
	
	
	@Test
	public void testPositiveNumeral() {
		assertEquals("I", numeralService.convertToRoman(1));
		assertEquals("C", numeralService.convertToRoman(100));		
	}
	
	@Test
	public void testZeroNumeral() {
		assertEquals("Invalid", numeralService.convertToRoman(0));
	
	}
	
	@Test
	public void testNegativeNumeral() {
		assertEquals("Invalid", numeralService.convertToRoman(-100));
		assertEquals("Invalid", numeralService.convertToRoman(-1));
	
	}


}
