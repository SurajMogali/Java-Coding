package com.demo.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareExample {

	public static void main(String[] args) {
		Comparator<Integer> comp=new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10> o2%10)
				{
					return 1;
					
				}
				
				else {
					return -1;
				}
				
			}
			
		};
		
		List<Integer> num=new ArrayList<>();
		num.add(27);
		num.add(90);
		num.add(78);
		num.add(34);
		num.add(23);
		
		Collections.sort(num,comp);
		System.out.println(num);
		
		
		
		
		

	}

}
