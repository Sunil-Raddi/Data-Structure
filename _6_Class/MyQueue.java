package _6_Class;

public class MyQueue {
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data = data;
		}
	}
	
	Node front, rear;
	int count = 0;
	
	// Method to add elements into the queue.
	public void enque(Object data) {
		Node n = new Node(data);
		if(front == null)
			front = n;
		else 
			rear.next = n;
		rear = n;
		count++;
	}
	
	//Method to delete the elements from the Queue.
	public Object deque() {
		if(front == null) {
			return "No elements in the queue";
		}
		Object data = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		count--;
		return data;
	}
	
	//Method to display elements in the string.
	@Override
	public String toString() {
		if(front == null)
			return "No elements in the Queue";
		String str = "";
		Node temp = front;
		while(temp!=null) {
			str += temp.data;
			if(temp.next != null) {
				str += "=>";
			}
			temp = temp.next;
		}
		return str;
	}
	
	//Method to return the size of the queue.
	public int size() {
		return count;
	}
}
