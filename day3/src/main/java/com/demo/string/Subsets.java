package com.demo.string;

public class Subsets {

	public static void main(String[] args) {
		String str="SURAJ";
		int len=str.length();
		int temp=0;
		String arr[]= new String[len*len+1/2];
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				arr[temp]=str.substring(i,j+1);
				temp++;
			}
		}
		
		for(int k=0;k<len;k++)
		{
			System.out.println(arr[k]);
		}



	}

}
