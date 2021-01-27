package com.ss.basics.dayfour;

import static org.junit.Assert.*;

import org.junit.Test;

public class parallelToTest {

	@Test
	public void test() {
		Line line1 = new Line(0,0,1,1);
		Line line2 = new Line(2,2,3,3);
		
		boolean result = line1.parallelTo(line2);
		
		assertEquals(true, result);

	}

}
