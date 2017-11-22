package com.java.algorithms.sorting;

/**
 * @author ${Suresh M Kumar}
 *
 * Nov 21, 2017
 */
public class BubbleSort {

	public static int[] bubleSort(int array[]){
		if(array != null && array.length>1){
			for(int i=0; i<array.length; i++){
				for(int j=i+1; j<array.length; j++){
					if(array[i]>array[j]){
						int temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
				}
			}
		}
		return array;
	}
	
	public static void main(String args[]){
		int array[]={95,9,95,87,8,81,18,54,57,53,92,15,38,24,8,56,29,69,64,66};
		System.out.print("Before buble sort :: ");
		for(int i:array)
			System.out.print(i + " ");
		array=bubleSort(array);//Calling Sort Method.
		System.out.print("\nAfter buble sort  :: ");
		for(int i:array)
			System.out.print(i + " ");
	}
	
	/**
	 * :: Bubble Sort :: 
	 * 
	 * Time Complexity ::	Best Case :: O(n).
	 * 					 	Average Case :: O(n^2).
	 * 						Worst Case :: O(n^2).
	 * 
	 * Space Complexity ::  O(1).
	 * 
	 * Algorithm :: Bubble sort algorithm will compare each element in 
	 * the array with the rest of the elements in the same array. If 
	 * it finds the another array element is smaller, then swaps the both
	 * elements and iteration continues.
	 * 
	 * 
	 * Not efficient sorting technique for the large set of elements.
	 * 
	 */
}
