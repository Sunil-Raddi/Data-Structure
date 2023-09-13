package _2_Class;

import java.util.Scanner;

public class NtoPower {
	
	static int powerOf(int n, int p) {
		return powerOf(n,p,1);		
	}
	
	static int powerOf(int n, int p, int pro) {
		if(p == 0)
			return pro;
		return powerOf(n,p-1,pro*n);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		System.out.println("Enter the power: ");
		int p = s.nextInt();
		System.out.println("The value of " + n + " exponential " + p + " is " + powerOf(n,p));
	}

}
