package _10_Clas;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExpression {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Postfix Expression: ");
		String st = s.next();
		double eva = evaluate(st);
		System.out.println("Evaluation of Expression: " + eva);
	}
	
	static double evaluate(String s) {
		Scanner scanner = new Scanner(System.in);
		Stack<Double> stk = new Stack<Double>();
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				System.out.println("Enter the value of " + ch  +" : ");
				stk.push(scanner.nextDouble());
			}
			else {
				double v2 = stk.pop();
				double v1 = stk.pop();
				switch(ch) {
				case '+': stk.push(v1+v2);
				break;
				case '-': stk.push(v1-v2);
				break;
				case '*': stk.push(v1*v2);
				break;
				case '/': stk.push(v1/v2);
				break;
				case '%': stk.push(v1%v2);
				break;
				}
			}
		}
		return stk.peek();
	}
}
