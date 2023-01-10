package com.learn2cod.springFrameWork;

import java.util.Arrays;

import abstractClass.Sorting;

public class BubbleSort extends Sorting {

	@Override
	public void sort(int[] arr) {
        //check if the element is swaped or not
		boolean exchange = true;
		
		int temp; // temporary object to hold the value whic needs to be swapped
		while (exchange) {
			exchange = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					exchange = true;

				}

			}

		}
		System.out.println(Arrays.toString(arr));

	}

}
