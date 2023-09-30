package _5_Class;

public class StackOperlDLL {
	class Node{
		Object data;
		Node next;
		Node prev;
		Node(Object data){
			this.data = data;
		}
	}

	Node top;
	int count;

	// Method to display the stack elements.
	@Override
	public String toString() {
		if(top == null) {
			return "No elements in the stack";
		}
		String str = "";
		Node temp = top;
		while(temp!=null) {
			str = str + temp.data;
			if(temp.next!=null)
				str = str + "<=>";
			temp = temp.next;
		}
		return str;
	}
	
	// Method to return top element in the stack.
	public Object peek() {
		if(top == null) {
			return "Stack underflow";
		}
		
		return top.data;
	}
	
	
	//Method to delete top element in the stack.
	public Object pop() {
		if(top == null) {
			return "Stack underflow";
		}
		Object data = top.data;
		top = top.next;
		top.prev = null;
		count--;
		return data;
	}

	// Method to add element into stack.
	public void push(Object data) {
		Node n = new Node(data);
		n.next = top;
		if(n.next != null)
			n.next.prev = n;
		top = n;
		count++;
	}
	
	// Method to check the total no of elements in the stack.
	public int size() {
		return count;
	}
}
