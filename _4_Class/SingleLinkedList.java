package _4_Class;

public class SingleLinkedList {
	class Node{
		Object data;
		Node next;
		Node(Object data){
			this.data = data;
		}
	}
	Node head;
	
//  Method to add element to SingleLinkedList at last node.
	void add(Object data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

//  Method to Print the Single linked list.
	@Override
	public String toString() {
		String str = "";
		Node temp = head;
		while(temp!=null) {
			str = str+temp.data;
			if(temp.next != null) {
				str = str + "->";
			}
			temp = temp.next;
		}
		return str;
	}

// Method to add element to Single linked list at first.
	public void addFirst(Object data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	
//  Method to add element in specified index.
	public void add(Object data, int in) {
		if(in == 0) {
			addFirst(data);
			return;
		}
		Node temp = head;
		while(temp != null && in>1) {
			in--;
			temp = temp.next;
		}
		if(in==1) {
			Node n = new Node(data);
			n.next = temp.next;
			temp.next = n;
			return;
		}
		else {
			System.out.println("Index not in the range");
		}
	}
	
//  Method to delete first element.
	public Object deleteFirst() {
		if(head == null) {
			return "No elements in the list";
		}
		Object ele = head.data;
		head = head.next;
		return ele;
	}
	
//  Method to delete the element in the last.
	public Object deleteLast() {
		if(head == null) {
			return "No elements found";
		}
		Node temp = head;
		Node prev = null;
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		if(prev!=null)
			prev.next = null;
		else
			head = null;
		return temp.data;
	}
	
//  Method to delete the elements from the specified index.
	public Object delete(int in)
	{
		if(in == 0)
			return deleteFirst();
		Node temp = head;
		while(in>1 && temp!=null){
			in--;
			temp = temp.next;
		}
		if(temp.next == null) {
			return "Index not in the range";
		}
		else {
			Object data = temp.next.data;
			temp.next = temp.next.next;
			return data;
		}
	}
	
// Method to add or sum all the elements in the list.
	public int sum1() {
		if(head == null) {
			return 0;
		}
		int sum = (Integer)head.data;
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
			sum += (Integer)temp.data;
		}
		return sum;
	}
	
//                                                      or
	
	public int sum2() {
		int total = 0;
		Node temp = head;
		while(temp != null) {
			total = total + (Integer)temp.data;
			temp = temp.next;
		}
		return total;
	}
	
//  Method to print the single linked list elements in reverse order.
	public void printReverse(Node first) {
		if(first == null) {
			return;
		}
		printReverse(first.next);
		System.out.println(first.data);
	}
	
// Method to reverse the linked list.
	public void reverse() {
		Node cur = head;
		Node prev = null;
		Node next = null;
		while(cur!=null) {
			next = cur.next;
			cur.next = prev;
			prev= cur;
			cur = next;
		}
		head = prev;
	}
}
