package _2_Class;

import java.util.Scanner;

public class SumOfObjects {
	static int sumOfArray(int[] arr) {
		return sumOfArray(arr, 0, 0);
	}
	
	static int sumOfArray(int[] arr, int in, int sum) {
		if(in>=arr.length)
			return sum;
		sum += arr[in];
		return sumOfArray(arr,in+1,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Index: ");
		int n = s.nextInt();
		System.out.println("Enter " + n + " elements in the Array");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("The sum of " + n + " Array elements is:" + sumOfArray(arr));
	}

}
