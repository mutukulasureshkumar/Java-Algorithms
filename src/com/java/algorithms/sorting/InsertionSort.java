package com.java.algorithms.sorting;

/**
 * @author ${Suresh M Kumar}
 *
 *         Nov 22, 2017
 */
public class InsertionSort {
	public static int[] insersionSort(int[] array) {
		if (array != null && array.length > 1) {
			for (int i = 1; i < array.length; i++) {
				int k=array[i];
				int j=i-1;
				while(j>=0 && array[j]>k){
					array[j+1]=array[j];
					j=j-1;
				}
				array[j+1]=k;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int array[] = { 95, 9, 95, 87, 8, 81, 18, 54, 57, 53, 92, 15, 38, 24, 8, 56, 29, 69, 64, 66 };
		System.out.print("Before insertion sort :: ");
		for (int i : array)
			System.out.print(i + " ");
		array = insersionSort(array);// Calling Sort Method.
		System.out.print("\nAfter insertion sort  :: ");
		for (int i : array)
			System.out.print(i + " ");
	}
	
	/**
	 * :: Insertion Sort :: 
	 * 
	 * Time Complexity ::	Best Case :: O(n)
	 * 					 	Average Case :: O(n^2)
	 * 						Worst Case :: O(n^2)
	 * 
	 * Selection Complexity ::  O(1).
	 * 
	 * Algorithm :: Insertion sort algorithm works based on inserting selected array element 
	 * in the correct position in the left side of the array elements.
	 * 
	 * 
	 * Not efficient sorting technique for the large set of elements.
	 * 
	 */
}
