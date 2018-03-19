package com.java.algorithms.sorting;

/**
 * @author ${Suresh M Kumar}
 *
 *         Nov 21, 2017
 */
public class BubbleSort {

	public static int[] bubleSort(int array[]) {
		boolean bestcase_check; 
		int temp;
		int count1=0;
		int count2=0;
		for (int i = 0; i < array.length - 1; i++) {
			++count1;
			bestcase_check = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				++count2;
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					bestcase_check = true;
				}
			}
			if (bestcase_check == false)
				break;
		}
		System.out.println("first iteration count :: "+count1+"\nsecond iteration count :: "+count2);
		return array;
	}

	public static void main(String args[]) {
		int array[] = { 95, 9, 95, 87, 8, 81, 18, 54, 57, 53, 92, 15, 38, 24, 8, 56, 29, 69, 64, 66, 96, 98, 99, 102 }; //Worst Case
		//int array[] = {1, 2, 3, 4, 5, 6} //Best Case
		//int array[] = {1, 2, 3, 2, 4, 7, 5, 8} //Average Case
		System.out.print("Before buble sort :: ");
		for (int i : array)
			System.out.print(i + " ");
		array = bubleSort(array);// Calling Sort Method.
		System.out.print("\nAfter buble sort  :: ");
		for (int i : array)
			System.out.print(i + " ");
	}

	/**
	 * :: Bubble Sort ::
	 * 
	 * Time Complexity :: Best Case - O(n) :: Average Case - O(n^2) :: Worst Case - O(n^2).
	 * 
	 * Space Complexity :: O(1).
	 * 
	 * Algorithm :: Bubble sort algorithm will compare each element in the array
	 * with the rest of the elements in the same array. If it finds the another
	 * array element is smaller, then swaps the both elements and iteration
	 * continues.
	 * 
	 * 
	 * Not efficient sorting technique for the large set of elements.
	 * 
	 */
}
