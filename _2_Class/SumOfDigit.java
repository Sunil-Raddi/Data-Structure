package _2_Class;

import java.util.Scanner;

public class SumOfDigit {
	
	static int digitSum(int n) {
		if(n==0) {
			return 0;
		} 
		
		return n%10 + digitSum(n/10); 
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		System.out.println("The sum of digits in " + n + " is " + digitSum(n));
	}

}
