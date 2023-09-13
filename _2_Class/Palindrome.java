package _2_Class;

import java.util.Scanner;

public class Palindrome {
	
	static boolean isPalindrome(int n) {
		return isPalindrome(n,0,n);
	}
	
	static boolean isPalindrome(int n, int rev, int temp) {
		if(n == 0)
			return rev == temp;
		rev=rev*10+n%10;
		return isPalindrome(n/10,rev,temp);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		if(isPalindrome(n))
			System.out.println("The given number is Palindrome");
		else
			System.out.println("The given number is not a Palindrome");
	}
}
