package com.demo.linear;

public class LinearSearch {

	int linearsearch(int key, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;

			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 20, 33, 45, 67 };
		LinearSearch l1 = new LinearSearch();
		System.out.println(l1.linearsearch(20, a));

	}

}
