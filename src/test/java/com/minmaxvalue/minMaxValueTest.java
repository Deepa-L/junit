package com.minmaxvalue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class minMaxValueTest {
	@Test
	public void minValue() {
		int [] sample= {2,43,421,45,65,87,56,90};
		minMaxValue m=new minMaxValue();
		int [] b=m.min(sample);
		assertEquals(b[0], 2);
	}
	@Test
	public void maxValue() {
		int[] sample = {2,43,421,45,65,87,56,90};
		minMaxValue m = new minMaxValue();
		int[] b = m.max(sample);
		assertEquals(b[0], 421);
	}

}
