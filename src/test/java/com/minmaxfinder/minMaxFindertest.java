package com.minmaxfinder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.minmaxfinder.minMaxFinder;

public class minMaxFindertest {
	@Test
	public void test() {
		minMaxFinder m = new minMaxFinder();
		int [] sample= {12,34,22,55,67,89};
		int [] b=m.findMinMax(sample);
		assertEquals(b[0], 12);
	}
	@Test
	public void Max() {
		minMaxFinder m=new minMaxFinder();
		int [] sample= {12,34,22,55,67,89};
		int [] b=m.findMinMax(sample);
		assertEquals(b[1], 89);
	}
	@Test
	public void MinMax() {
		minMaxFinder m=new minMaxFinder();
		int [] sample= {12,34,22,55,67,89};
		int [] b=m.findMinMax(sample);
		assertEquals(b[1], 89);
		assertEquals(b[0], 12);
	}

}
