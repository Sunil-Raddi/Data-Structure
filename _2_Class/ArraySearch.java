package _2_Class;

import java.util.Scanner;

public class ArraySearch {
	
	// Array tracing in Forward Direction 
	static int searchfrwd(int[] arr, int ele) {
		return searchfrwd(arr,0,ele);
	}
	
	static int searchfrwd(int[] arr, int in, int ele) {
		if(in>=arr.length)
			return -1;
		if(arr[in] == ele)
			return in;
		return searchfrwd(arr,in+1,ele);
	}

	// Array tracing in Reverse Direction 
	static int searchrev(int[] arr, int ele) {
		return searchrev(arr,arr.length-1,ele);
	}
	
	static int searchrev(int[] arr, int in, int ele) {
		if(in<0)
			return -1;
		if(arr[in] == ele)
			return in;
		return searchrev(arr,in-1,ele);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the index of Array");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + " array Elements: ");
		for(int i = 0; i<n; i++) {
			arr[i] = s.nextInt(); 
		}
		System.out.println("Enter the number to search in the Array");
		int e = s.nextInt();
		int res = searchfrwd(arr,e);
		if(res == -1)
			System.out.println("The given number " + e + " is not present in the Array");
		else
			System.out.println("The given number " + e + " is present in the Array of Index " + res);
			
	}

}
