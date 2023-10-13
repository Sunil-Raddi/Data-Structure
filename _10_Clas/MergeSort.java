package _10_Clas;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int n = s.nextInt();
		int[] arr= new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = s.nextInt();
		}
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void mergeSort(int[] x) {
		mergeSort(x,0,x.length-1);
	}
	
	public static void mergeSort(int[] x,int l, int h) {
		if(l<h) {
			int m = (l+h)/2;
			mergeSort(x,l,m);
			mergeSort(x,m+1,h);
			merge(x,l,m,h);
		}
	}
	
	public static void merge(int[] x, int l, int m, int h) {
		int[] a = new int[h-l+1];
		int i = l;
		int j = m+1;
		int k = 0;
		while(i<=m && j<=h) {
			if(x[i]<x[j]) 
				a[k++] = x[i++];
			else
				a[k++] = x[j++];
		}
		while(i<=m)
			a[k++] = x[i++];
		while(j<=h)
			a[k++] = x[j++];
		for(int in=0; in<a.length; in++) {
			x[l+in] = a[in];
		}
	}
}
