package com.capgemini.day5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.test.MyCalculator1;

class MyCalculator1Test {

	@Test
	void testPower() throws Exception {
		assertEquals(243,MyCalculator1.power(3,5));
		assertEquals(16,MyCalculator1.power(2,4));
		assertEquals(32,MyCalculator1.power(2,5));
		
		
//		Executable e=()->MyCalculator.power(0,0);
		
		assertThrows(Exception.class,()->MyCalculator1.power(0,0));
//		assertT
	}
}
