package _3_Class;

import java.util.Scanner;

public class InsertionSort {

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
	public static void insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int v = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>v)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = v;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = readArray();
		insertionSort(arr);
		System.out.println("The Array after sorting: ");
		dispArray(arr);
	}
}
