package com.demo.bubble;

public class BubbleSort {
	void bubble(int arr[]) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}

		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}

	}

	public static void main(String[] args) {
		int a[] = { 2, 5, 8, 3, 0, 7 };
		BubbleSort bubbleSort = new BubbleSort();

		bubbleSort.bubble(a);

	}

}
