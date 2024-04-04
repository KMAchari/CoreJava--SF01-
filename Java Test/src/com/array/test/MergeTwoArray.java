package com.array.test;

import java.util.Arrays;

class MergeTwoArray
{
	 private static void merge(int [] X, int [] Y, int m, int n) {
		 int k = m + n+1;
		 
		 while(m>= 0 && n>= 0)
		 {
			 if(X[m] >Y[n])
			 {
				 X[k--] = X[m--];
			 }
			 else {
				 X[k--] = Y[n--];
			 }
		 }
		 Arrays.fill(Y, 0);
		 
	 }
	 public static void rearrange(int [] X, int[] y) {
		 if(X.length == 0) {
			 return;
			 
		 }
		 int k=0;
		 for (int value: X) {
			 if(value != 0) {
				 X[k++] = value;
			 }
		 }
		 merge(X,y,k -1, y.length -1);
		 
	 }
	 public static void main(String[] args)
	 {
		 int[] X= {0,2,0,3,0,5,6,0,0};
		 int []Y = {1,8,9,10,15};
		 rearrange(X,Y);
		 System.out.println(Arrays.toString(X));
	 }
	 

}
