package _4_Class;

public class StackOperation {
	
	int capacity,top;
	Object[] obj;
	
	// creating stack with given size.
	StackOperation(int capacity) {
		this.capacity = capacity;
		obj = new Object[capacity];
		top = -1;
	}
	
	//Method to print the stack.
	@Override
	public String toString() {
		String str = "[";
		for(int i=0; i<=top; i++) {
			str = str + obj[i];
			if(i<top)
				str = str + ",";
		}
		return str+"]";
	}
	
	//Method to push object into stack.
	void push(Object ele) {
		if(top == capacity-1) {
			System.out.println("Stack is Overflow..!!");
			return;
		}
		obj[++top] = ele;
	}
	
	//Method to pop an object from Stack.
	public Object pop() {
		if(top == -1) {
			System.out.println("Stack is underflow..!!");
			return null;
		}
		return obj[top--];
	}
	
	//Method to get the top element in the stack.
	public Object peek() {
		if(top == -1) {
			System.out.println("Stack is Underflow..");
			return null;
		}
		return obj[top];
	}
	
	//Method to search the element from stack and return index.
	public int search(Object ele) {
		for (int i=0; i<=top; i++) {
			if(obj[i].equals(ele))
				return top-i+1;
		}
		return 0;
	}
	
	//Method to return the size of stack.
	public int size() {
		return top+1;
	}
	
}
