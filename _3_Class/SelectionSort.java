package _3_Class;

import java.util.Scanner;

public class SelectionSort {

	public static int[] readArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int n = s.nextInt();
		System.out.println("Enter the " + n + " array elements: ");		
		int[] arr = new int[n];
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		return  arr;
	}

	public static void dispArray(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

	// Selection sorting
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			if(min != i){
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = readArray();
		selectionSort(arr);
		System.out.println("The Array after sorting: ");
		dispArray(arr);
	}
}
