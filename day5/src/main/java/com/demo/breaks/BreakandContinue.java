package com.demo.breaks;

public class BreakandContinue {

	public static void main(String[] args) {
		int n = 20; int i;
		for ( i = 2; i < n; i++) {
			if (i % 3 == 0) {
				continue;

			}
			if(i==19)
			{
				break;
			}
		}
		System.out.println(i);	
		
	}
	
	

}
