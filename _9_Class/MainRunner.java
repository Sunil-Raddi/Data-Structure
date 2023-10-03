package _9_Class;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Boolean> result = new ArrayList<Boolean>();
		while(n>0) {
			int val = s.nextInt();
			result.add(isPrime(val));
			n--;
		}
		for(Boolean b : result) {
			System.out.println(b);
		}
	}
	
	static Boolean isPrime(int n) {
		for(int i=2; i<n/2; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
}
