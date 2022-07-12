package com.minmaxvalue;

public class minMaxValue {
	 public int [] min(int [] a) {
		  int [] b= new int[1];
		  int small;
			for(int i=0;i<a.length-1;i++) {
				if(a[i]<a[i+1]) {
					 small=a[i];
					 b[0]=small;
					 for(int j=0;j<a.length-1;j++)
						 if(a[j]<b[0]) {
							 b[0]=a[j];
						 }
				}
			}
			return b;
	  }
	 public int[] max(int[] a) {
		 int[] b = new int[1];
		 for(int i=0;i<a.length-1;i++) {
				if(a[i]>b[0]) {
					b[0]=a[i];
				}
			}
			return b;
	  }
}