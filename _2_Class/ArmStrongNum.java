package _2_Class;

import java.util.Scanner;

public class ArmStrongNum {
	
    // Function to calculate the number of digits in a number
	static int countDigit(int n) {
		return countDigit(n,0);
	}
	
	static int countDigit(int n, int sum) {
		if(n==0)
			return sum;
		return countDigit(n/10,sum+1);
	}
    
    // Function to calculate the power of digit.
    static int powerOf(int n, int p) {
		return powerOf(n,p,1);		
	}
	
	static int powerOf(int n, int p, int pro) {
		if(p == 0)
			return pro;
		return powerOf(n,p-1,pro*n);
	}

    // Function to check if a number is an Armstrong number using recursion
    static boolean isArmstrong(int num, int n) {
        if (num == 0)
            return true;
        
        return isArmstrong(num, n, num, 0);
    }
    
    static boolean isArmstrong(int num, int n, int temp, int sum) {
    	if(num == 0)
    		return sum == temp;
    	sum += powerOf(num%10,n);
    	return isArmstrong(num/10, n, temp, sum); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int numberOfDigits = countDigit(number);
        boolean result = isArmstrong(number, numberOfDigits);

        if (result)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
        System.out.println();
        System.out.println("Do you want to continue press -> 1 or Press any no to exit");
        choice = scanner.nextInt();
        System.out.println();
        }
        scanner.close();
    }
}
