package _2_Class;

import java.util.Scanner;

public class GreatestCommonDivisor { 
	
	static int gcd(int a, int b) {
		if(a>b)
			return gcd(b,a);
		if(b%a==0)
			return a;
		return gcd(b-a,a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = s.nextInt();
		System.out.println("Enter the 2nd number");
		int b = s.nextInt();
		System.out.println("The GCD of two number is: " + gcd(a,b));
	}

}
