package _2_Class;

import java.util.Scanner;

public class StringPalindrome {
	
	static boolean isPalindrome(String str) {
		return isPalindrome(str.toLowerCase(),0,str.length()-1);
	}
	
	static boolean isPalindrome(String str, int f, int l) {
		if(f>l)
			return true;
		if(str.charAt(f) != str.charAt(l))
			return false;
		return isPalindrome(str,f+1,l-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		if(isPalindrome(str))
			System.out.println("The given String is Palindrome");
		else
			System.out.println("The given String is not a Palindrome");
			
	}
}
