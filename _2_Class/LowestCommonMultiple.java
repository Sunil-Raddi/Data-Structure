package _2_Class;

import java.util.Scanner;

public class LowestCommonMultiple {
	
	static int lcm(int a, int b) {
		if(a>b)
			return lcm(b,a);
		return lcm(a,b,b);
	}
	
	static int lcm(int a, int b, int pro) {
		if(pro%a==0)
			return pro;
		return lcm(a,b,pro+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = s.nextInt();
		System.out.println("Enter the second number: ");
		int b = s.nextInt();
		System.out.println("The LCM of two number is : " + lcm(a,b));
	}

}
