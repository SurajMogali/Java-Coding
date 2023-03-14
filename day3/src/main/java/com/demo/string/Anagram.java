package com.demo.string;

import java.util.Arrays;

public class Anagram {

	public boolean anag(String s1, String s2) {
		char ch1[] = s1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		char ch2[] = s2.toCharArray();
		Arrays.sort(ch2);
		System.out.println(ch2);
		int num = Arrays.compare(ch1, ch2);
		if (num == 0) {
			return true;

		} else {
			return false;

		}

	}

	public static void main(String[] args) {
		Anagram a1 = new Anagram();
		System.out.println(a1.anag("suraj", "jarus"));
	}
}
