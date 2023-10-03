package _9_Class;

import java.util.Scanner;

public class TowerOfHonai {
	
	static void towerOfHonai(int n, char s, char t, char d) {
		if(n==1) {
			System.out.println(n + " disk move from " + s + " to " + d);
			return;
		}
		towerOfHonai(n-1,s,d,t);
		System.out.println(n + " disk move from " + s + " to " + d);
		towerOfHonai(n-1,t,s,d);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of disks in the source tower: ");
		int n = s.nextInt();
		towerOfHonai(n,'S','T','D');
	}

}
