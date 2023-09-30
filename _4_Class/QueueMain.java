package _4_Class;

public class QueueMain {
	public static void main(String[] args) {
		QueueOperation q = new QueueOperation(5);
		q.enque(34);
		q.enque(56);
		q.enque(23);
		q.enque(84);
		q.enque(04);
		q.enque(64);
		System.out.println(q);
		System.out.println(q.deque());
		System.out.println(q);
	}
}
