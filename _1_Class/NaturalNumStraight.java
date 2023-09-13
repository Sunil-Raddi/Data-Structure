package _1_Class;

import java.util.Scanner;

public class NaturalNumStraight {
	
	static void naturalNum(int n) {
		if(n>1)
			naturalNum(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements to print: ");
		int n = s.nextInt();
		System.out.println("Here they come...!!!");
		naturalNum(n);
	}

}
