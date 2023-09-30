package _4_Class;

public class StackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackOperation s = new StackOperation(5);
		s.push(24);
		s.push(56);
		s.push(77);
		s.push(285);
		s.push(263);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.search(285));
	}

}
