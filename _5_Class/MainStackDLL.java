package _5_Class;

public class MainStackDLL {
	public static void main(String[] args) {
		StackOperlDLL s = new StackOperlDLL();
		s.push(10);		
		s.push(20);		
		s.push(30);		
		s.push(40);		
		s.push(50);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
	}
	
}
