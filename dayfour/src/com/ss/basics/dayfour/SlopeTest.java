package com.ss.basics.dayfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class SlopeTest {

	@Test
	public void testSlope() {
		Line lineSlope = new Line(0,4,2,6);
		double result = lineSlope.getSlope();
		System.out.println(result);
		
		assertEquals(1.0, result, 0.00001);
	}


}
