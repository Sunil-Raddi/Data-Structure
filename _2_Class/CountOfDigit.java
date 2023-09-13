package _2_Class;

import java.util.Scanner;

public class CountOfDigit {
	
	static int countDigit(int n) {
		return countDigit(n,1);
	}
	
	static int countDigit(int n, int sum) {
		if(n==0)
			return sum;
		return countDigit(n/10,sum+1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		System.out.println("There are " + countDigit(n) + " in the number " + n);
	}
}
