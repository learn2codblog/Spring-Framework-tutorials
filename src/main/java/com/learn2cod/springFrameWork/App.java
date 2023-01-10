package com.learn2cod.springFrameWork;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Stream;

import javax.lang.model.util.Elements;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of an array ");

		int length = scanner.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Enter the value of arrays :");
			int element = scanner.nextInt();
			arr[i] = element;
		}

//		int[] arr = { 2, 5, 4, 6, 8, 7 };

		System.out.println("Array before sorting : ");

		for (int element : arr) {

			System.out.println(element);
		}
		
		System.out.println("Element after sorting");
		BubbleSort sort = new BubbleSort();
		sort.sort(arr);

		System.out.println("Enter the value to search in the sorted array : ");

		int value = scanner.nextInt();

		

		LinearSearch linearSearch = new LinearSearch();

		int index = linearSearch.searchIndex(arr, value);

		BinarySearch binarySearch = new BinarySearch();

		int nextValue = binarySearch.searchIndex(arr, value);

		if (index == -1 && nextValue == -1) {
			System.out.println("Value is not present in the array");
		} else {
			System.out.println("Value from linear search :" + index);

			System.out.println("Value from binarySearch :" + nextValue);
		}

	}

}
