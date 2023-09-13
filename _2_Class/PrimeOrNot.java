package _2_Class;

import java.util.Scanner;

public class PrimeOrNot {
	static boolean isPrime(int n){
		return isPrime(n,2);
	}
	
	static boolean isPrime(int n, int x) {
		if(x > n/2)
			return true;
		if(n%x == 0)
			return false;
		return isPrime(n,x+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = s.nextInt();
		if(isPrime(n)) {
			System.out.println("The Given Number " + n + " is Prime Number.");
		}
		else 
			System.out.println("The Given Number " + n + " is not a Prime Number.");
	}

}
