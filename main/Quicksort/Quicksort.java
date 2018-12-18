package main.Quicksort;

import java.util.Arrays;

public class Quicksort {
	
	public static void main(String[] args) {
		Quicksort thisSort = new Quicksort();
		Integer[] age = { 10, 35, 67, 89, 6, 46, 119, 45, 23, 30, 87, 75 };
		
		System.out.println(Arrays.toString(age));
		thisSort.intializeSorting(age);
		System.out.println(Arrays.toString(age));
	}
	
	void intializeSorting(Integer[] myArray) {
		quicksort(myArray, 0, myArray.length-1);
	}
	
	void quicksort(Integer[] myArray, int low, int max) {		
		if(low < max + 1) {
			int border = sortPartition(myArray, low, max);
			quicksort(myArray, low, border-1);
			quicksort(myArray, border+1, max);
		}
	}
	
	void swap(Integer[] myArray, int indexLow, int indexMax) {
		int valueLow = myArray[indexLow];
		myArray[indexLow] = myArray[indexMax];
		myArray[indexMax] = valueLow;
	}
	
	int setPivot(int low, int max) {
		int pivot = (int) (Math.random() * (low-max) + max);
		System.out.println("This is the pivot between " + low + " and " + max + ": " + pivot);
		return pivot;
	}
	
	int sortPartition(Integer[] myArray, int low, int max) {
		swap(myArray, low, setPivot(low, max));
		int border = low + 1;
		
		for(int i = border; i <= max; i++) {	
			if(myArray[i] < myArray[low]) {
				swap(myArray, i, border++);
			} 
		}
		
		swap(myArray, low, border-1);
		return border-1;
	}
}