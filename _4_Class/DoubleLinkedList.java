package _4_Class;

public class DoubleLinkedList {
	class Node{
		Object data;
		Node prev;
		Node next;
		Node(Object data){
			this.data = data;
		}
	}

	Node head;

	//  Method to display all the Double linked list element.
	@Override
	public String toString() {
		String str = "";
		Node temp = head;
		while(temp != null) {
			str = str + temp.data;
			if(temp.next != null) {
				str = str + "  <-> ";
			}
			temp = temp.next;
		}
		return str;
	}

	//  Method add object to double linked list.
	public void add(Object data)
	{
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
		n.prev = temp;
	}

	//  Method to add Object at First to double linked list.
	public void addFirst(Object data) {
		Node n = new Node(data);
		if(head == null) {
			head = n;
			return ;
		}
		n.next = head;
		head.prev = n;
		head = n;
	}

	//  Method to add Object at specified index to double linked list.
	public void add(Object data, int in) {
		if(in == 0) {
			addFirst(data);
			return;
		}
		Node temp = head;
		while(temp!=null && in>1) {
			in--;
			temp = temp.next;
		}
		if(temp == null) {
			System.out.println("Index out of range");
			return ;
		}
		Node n = new Node(data);
		n.next = temp.next;
		n.prev = temp;
		temp.next = n;
		if(n.next != null)
			n.next.prev = n;
	}

	//  Method to delete the element from the first index
	public Object deleteFirst() {
		if(head == null) {
			return "There are no elements in the list";
		}
		Object data = head.data;
		head = head.next;
		if(head!=null)
			head.prev = null;
		return data;
	}

	//  Method to delete last element from double linked list.
	public Object deleteLast() {
		if(head == null)
			return "There are no elements in the list";
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		if(temp.prev!=null)
			temp.prev.next = null;
		else
			head = null;
		return temp.data;
	}

	//  Method to delete the element from the specified index.
	public Object delete1(int in) {
		if(in == 0) {
			return deleteFirst();
		}
		Node temp = head;
		while(temp!=null && in>1) {
			in--;
			temp = temp.next;
		}
		Object data;
		if(temp.next == null) {
			return "index not in range";
		}
		else {
			if(temp.next.next == null) {
				data = temp.next;
				temp.next = null;
				return data;
			}
			else {
				data = temp.next.data;
				temp.next = temp.next.next;
				temp.next.prev = temp;
				return data;
			}
		}
	}
	
//                                                       or
	
	public Object delete2(int in) {
		if(in == 0)
			return deleteFirst();
		Node temp = head;
		while(temp != null && in>0) {
			temp = temp.next;
			in--;
		}
		if(temp == null)
			return "index not in range";
		temp.prev.next = temp.next;
		if(temp.next != null) 
			temp.next.prev = temp.prev;
		
		return temp.data;		
	}
	
  //  Method to reverse the Double linked list
	public void reverse() {
		Node temp = head;
		Node prev;
		while(temp != null) {
			prev = temp.next;
			temp.next = temp.prev;
			temp.prev = prev;
			if(prev != null) {
				temp=prev;
			}
			else {
				head = prev;
				break;
			}
		}
	}
	
	
}

