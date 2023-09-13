package _1_Class;

import java.util.Scanner;

public class SumOfNaturalNum {
	
	static int sum(int n) {
		if(n == 1)
			return 1;
			
		return n + sum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		System.out.println("Here is output...!!!");
		System.out.println("The Sum of 1 to " + n + " is : " + sum(n));
	}

}
