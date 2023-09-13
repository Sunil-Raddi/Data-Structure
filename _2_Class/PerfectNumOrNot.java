package _2_Class;

import java.util.Scanner;

public class PerfectNumOrNot {

	static boolean isPerfect(int n) {
		return isPerfect(n,0,1);
	}

	static boolean isPerfect(int n, int sum, int i) {
		if(i>n/2)
			return sum == n;
		if(n%i == 0)
			sum += i;
		return isPerfect(n,sum,i+1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the number");
			int n = s.nextInt();
			try {
			if(isPerfect(n))
				System.out.println("the given number " + n + " is Perfect number");
			else 
				System.out.println("the given number " + n + " is not Perfect number");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		    System.out.println();
		}
	}
}
