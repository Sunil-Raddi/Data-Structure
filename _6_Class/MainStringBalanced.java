package _6_Class;

import java.util.Scanner;
import java.util.Stack;

public class MainStringBalanced {
	
	// Method to check entered String is Balanced or Not.
	static boolean isBalance(String s) {
		if(s.length()%2==1)
			return false;
		Stack<Character> stk = new Stack<Character>();
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(')
				stk.push(ch);
			else {
				if(stk.isEmpty()) {
					return false;
				}
			}
			
			switch(ch) {
			case '}' : if(stk.pop()!= '{')
							return false;
						break;
			case ']' : if(stk.pop()!= '[')
							return false;
						break;
			case ')' : if(stk.pop()!= '(')
							return false;
						break;
			}
		}
		return stk.isEmpty();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = s.next();
		boolean rs = isBalance(str);
		if(rs)
			System.out.println("String is Balanced");
		else
			System.out.println("String is not Balanced");
	}

}
