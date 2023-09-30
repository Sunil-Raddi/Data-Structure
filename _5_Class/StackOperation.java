package _5_Class;

//  Stack implementation using Single Linked List.
public class StackOperation {
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data = data;
		}
	}
	Node top;
	int count = 0;
	
	//  Method to add elements to stack.
	public void push(Object data) {
		Node n = new Node(data);
		n.next = top;
		top = n;
		count++;
	}
	
	//  Method to give the top element in the stack.
	public Object peek() {
		if(top == null)
			return "Stack UnderFlow";
		else 
			return top.data;
	}
	
	//  Method to delete the top elements.
	public Object pop() {
		if(top == null)
			return "Stack is under flow";
		Object data = top.data;
		top = top.next;
		count--;
		return data;
	}
	
	//  Method to display all the elements.
	@Override
	public String toString() {
		String str = "";
		Node temp = top;
		while(temp != null) {
			str = str + temp.data;
			if(temp.next != null)
				str = str + "<=";
			temp = temp.next;
		}
		return str;
	}
	
	//  Method to return no of elements.
	public int size() {
		return count;
	}
}
