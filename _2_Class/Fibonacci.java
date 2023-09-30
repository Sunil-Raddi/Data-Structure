package _2_Class;

import java.util.Scanner;

public class Fibonacci {
	
	static int fibonacci(int n) {
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		System.out.println("The " + n + " Fibonacci number is " + fibonacci(n));
	}

}
