package _1_Class;

import java.util.Scanner;

public class ProdOfNaturalNumb {
	static int product(int n) {
		if(n==0 || n==1)
			return 1;
		return n*product(n-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = s.nextInt();
		System.out.println("The product of " + n + " is " + product(n));
	}
}
