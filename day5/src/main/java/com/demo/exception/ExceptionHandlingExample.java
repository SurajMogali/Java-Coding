package com.demo.exception;

import java.util.Scanner;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();

		int a = 10;
		try {
			if (b == 0) {
				throw new DividebyZeroException();

			}

			System.out.println(a / b);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("end");
		}

	}

}
