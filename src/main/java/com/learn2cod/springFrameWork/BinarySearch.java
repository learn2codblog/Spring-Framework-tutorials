/**
 * 
 */
package com.learn2cod.springFrameWork;

import abstractClass.Searching;

/**
 * @author HP
 * 
 * Applicable for Sorted array only 
 *
 */
public class BinarySearch extends Searching {

	@Override
	public int searchIndex(int[] arr, int val) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == val) {
				return mid+1;
			} else if (arr[mid] > val) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;

	}
}
