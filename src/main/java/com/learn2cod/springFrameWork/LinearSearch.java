/**
 * 
 */
package com.learn2cod.springFrameWork;

import abstractClass.Searching;

/**
 * @author HP
 *
 */
public class LinearSearch extends Searching {

	@Override
	public int searchIndex(int[] arr, int val) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==val) {
				return i+1;
			}
		}
		
		return -1;
	}

}
