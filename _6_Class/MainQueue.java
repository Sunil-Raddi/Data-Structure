package _6_Class;

public class MainQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue m = new MyQueue();
		m.enque(10);
		m.enque(20);
		m.enque(30);
		m.enque(40);
		m.enque(50);
		m.enque(60);
		System.out.println(m);
		System.out.println(m.deque());
		System.out.println(m);
		System.out.println(m.size());
	}

}
