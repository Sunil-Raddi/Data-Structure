package _2_Class;

import java.util.Scanner;


public class ProductOfDigit {
	
	static int productDigit(int n){
		if(n<10)
			return n;
		return n%10 * productDigit(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		System.out.println("The Product of Digit of " + n + " is: " + productDigit(n) );
		
	}

}
