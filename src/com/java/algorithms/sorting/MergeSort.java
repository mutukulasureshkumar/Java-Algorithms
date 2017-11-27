package com.java.algorithms.sorting;

public class MergeSort {

	static int temp[] = null;

	public static void divide(int[] array, int startPos, int endPos) {
		if (startPos < endPos) {
			int midPos = (startPos + endPos) / 2;
			divide(array, startPos, midPos);
			divide(array, midPos + 1, endPos);
			mergeSort(array, startPos, midPos, endPos);
		}
	}

	public static void mergeSort(int[] array, int startPos, int midPos, int endPos) {
		int n1 = midPos - startPos + 1;
		int n2 = endPos - midPos;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = array[startPos + i];
		for (int j = 0; j < n2; ++j)
			R[j] = array[midPos + 1 + j];

		int i = 0, j = 0;
		int k = startPos;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int array[] = { 95, 9, 95, 87, 8, 81, 18, 54, 57, 53, 92, 15, 38, 24, 8, 56, 29, 69, 64, 66 };
		System.out.print("Before insertion sort :: ");
		for (int i : array)
			System.out.print(i + " ");
		divide(array, 0, array.length);// Calling Sort Method.
		System.out.print("\nAfter insertion sort  :: ");
		for (int i : array)
			System.out.print(i + " ");
	}

}
