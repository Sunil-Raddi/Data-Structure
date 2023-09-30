package _4_Class;

public class QueueOperation {
	int capacity, front, rear;
	Object[] obj;
	public QueueOperation(int capacity) {
		// TODO Auto-generated constructor stub
		this.capacity = capacity;
		obj = new Object[capacity];
		rear = front = -1;
	}
	
	void enque(Object ele)
	{
		if(rear == capacity-1) {
			System.out.println("Queue is full");
			return ;
		}
		if(front == -1)
			front = 0;
		obj[++rear] = ele;
	}
	
	@Override
	public String toString() {
		String str = "[";
		for(int i=front; i<=rear && i>=0; i++) {
			str = str + obj[i];
			if(i<rear)
				str = str + ",";
		}
		return str + "]";
	}
	
	public Object deque() {
		if(front == -1) {
			System.out.println("Queue is empty");
			return null;
		}
		Object ele = obj[front++];
		if(front>rear)
			rear = front = -1;
		return ele;
	}
}
