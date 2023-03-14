package com.demo.arrays;

import java.util.Arrays;

public class SecLarge {

	int sec(int a[]) {
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if (a[a.length - 1 - i] == a[a.length - 2 - i]) {
				return a[a.length - 2 - i];

			}

		}
		return -1;
		

	}



	public void main(String args[])
	{
		SecLarge s=new SecLarge();
		int a[]= {1,2,3,7,2,9,10};
		System.out.println(s.sec(a));
		
	}
}
