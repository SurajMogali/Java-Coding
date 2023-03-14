package com.demo.string;

public class Vowels {

	public static void main(String[] args) {
		String str = "Suraj";
		int vcount = 0, ccount = 0;
		String s1 = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				vcount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ccount++;
			}
		}

		System.out.println(vcount + " " + ccount);

	}

}
