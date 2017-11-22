package com.java.algorithms.sorting;

/**
 * @author ${Suresh M Kumar}
 *
 * Nov 21, 2017
 */
public class SelectionSort {
	
	public static int[] selectionSort(int[] array){
		if(array!=null && array.length>1){
			for(int i=0; i<array.length; i++){
				int index=i;
				for(int j=i+1; j<array.length; j++){
					if(array[j]<array[index])
						index=j;
				}
				int temp=array[index];
				array[index]=array[i];
				array[i]=temp;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int array[]={95,9,95,87,8,81,18,54,57,53,92,15,38,24,8,56,29,69,64,66};
		System.out.print("Before selection sort :: ");
		for(int i:array)
			System.out.print(i + " ");
		array=selectionSort(array);//Calling Sort Method.
		System.out.print("\nAfter selection sort  :: ");
		for(int i:array)
			System.out.print(i + " ");
	}
	
	/**
	 * :: Selection Sort :: 
	 * 
	 * Time Complexity ::	Best Case :: O(n^2)
	 * 					 	Average Case :: O(n^2)
	 * 						Worst Case :: O(n^2)
	 * 
	 * Selection Complexity ::  O(1).
	 * 
	 * Algorithm :: Selection sort algorithm having loop inside loop. Inner loop
	 * will compare every element in the array with the outer loop element and finds 
	 * the smallest element then the outer element and replace their positions.
	 * 
	 * 
	 * Not efficient sorting technique for the large set of elements..
	 * 
	 */

}
