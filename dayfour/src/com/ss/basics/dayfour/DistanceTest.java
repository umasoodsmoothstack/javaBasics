package com.ss.basics.dayfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {

	@Test
	public void testDistance() {
		Line line = new Line(0,4,2,6);
		
		double result = line.getDistance();

		assertEquals(2.8284271247461903, result, .00000000001);
	}

}
