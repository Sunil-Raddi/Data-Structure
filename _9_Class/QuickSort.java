package _9_Class;

import java.util.Arrays;

public class QuickSort {
	
	static void quickSort(int[] ar) {
		quickSort(ar,0,ar.length-1);
	}
	
	static void quickSort(int[] ar, int low, int high) {
		if(low<high) {
			int j = partition(ar,low,high);
			quickSort(ar,low,j-1);
			quickSort(ar,j+1,high);
		}
	}
	
	static int partition(int[] x, int low, int high) {
		int pivot = x[low];
		int i = low+1;
		int j = high;
		while(i<=j) {
			while(i<=high && x[i]<pivot)
				i++;
			while(j>=low && x[j]>pivot)
				j--;
			if(i<j) {
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}
		}
		x[low] = x[j];
		x[j] = pivot;
		return j;
	}

	public static void main(String[] args) {
		int[] ar = {34,45,26,23,15,56,35,28};
		quickSort(ar);
		System.out.println(Arrays.toString(ar));
	}

}
