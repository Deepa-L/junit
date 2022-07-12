package com.minmaxfinder;

public class minMaxFinder {
	public int[] findMinMax(int[] a) {
		int[] b = new int[2];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				b[0] = a[i - 1];
			}
			if (a[i] < a[i + 1]) {
				b[1] = a[i + 1];
			}
		}
		return b;

	}

	public static void main(String[] args) {
		int[] sample = { 12, 34, 22, 55, 67, 89 };

		minMaxFinder m = new minMaxFinder();
		int[] b = m.findMinMax(sample);
		for (int i : b) {
			System.out.println(i);
		}

	}
}
