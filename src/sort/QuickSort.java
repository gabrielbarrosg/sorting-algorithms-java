package sort;

import java.util.Random;

public class QuickSort {
	
	private static void quicksort(int[] array) {
		quicksort(array, 0, array.length -1);
	}
	
	public static void quicksort(int[] array, int lowIndex, int highIndex) {
		if(lowIndex >= highIndex) {
			return;
		}
		
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);
		
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		
		quicksort(array, lowIndex, leftPointer -1);
		quicksort(array, leftPointer +1, highIndex);
	}
	
	

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while (leftPointer < rightPointer) {
			
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {	
				leftPointer++;
			}
			while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(array, leftPointer, rightPointer);
		}
		swap(array, leftPointer, highIndex);
		return leftPointer;
	}
	
	private static void swap(int[] array, int index1, int index2) {
		int tempValue = array[index1];
		array[index1] = array[index2];
		array[index2] = tempValue;
	}
	
}
