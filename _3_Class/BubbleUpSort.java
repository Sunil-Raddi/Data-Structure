package _3_Class;

import java.util.Scanner;

public class BubbleUpSort {
	
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
	
	// Bubble up sorting ( Biggest element moved to last index.
	public static void bubbleUp(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	// Bubble down sorting ( Smallest element moved to first index.
	public static void bubbleDown(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[j];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			dispArray(arr);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = readArray();
		bubbleUp(arr);
		System.out.println("The Array after sorting: ");
		dispArray(arr);
	}
}
