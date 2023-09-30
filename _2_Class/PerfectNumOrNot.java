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
		int choice = 1;

		while(choice == 1) {
			System.out.println("Enter the number");
			int n = s.nextInt();
			if(isPerfect(n))
				System.out.println("the given number " + n + " is Perfect number");
			else 
				System.out.println("the given number " + n + " is not Perfect number");
			System.out.println();

			System.out.println("Do yo want to continue, yes -> press 1 & no -> press any number");
			choice = s.nextInt();
		}

	}
}
