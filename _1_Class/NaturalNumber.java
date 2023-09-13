package _1_Class;

import java.util.Scanner;

public class NaturalNumber {
	
	static void firstNaturalNum(int n) {
		if(n==0)
			return;
		System.out.println(n);
		firstNaturalNum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements to print");
		int n = s.nextInt();
		System.out.println("Here they Come...!!!");
		firstNaturalNum(n);
		s.close();
	}

}
